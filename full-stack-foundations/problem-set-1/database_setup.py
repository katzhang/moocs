import os
import sys

from sqlalchemy import Table, Column, ForeignKey, Integer, String, Date, Numeric
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import relationship
from sqlalchemy import create_engine

Base = declarative_base()

# two classes, two tables

class Shelter(Base):
    __tablename__ = 'shelter'
    id = Column(Integer, primary_key = True)
    name =Column(String(80), nullable = False)
    address = Column(String(250))
    city = Column(String(80))
    state = Column(String(20))
    zipCode = Column(String(10))
    website = Column(String)
    maximum_capacity = Column(Integer)
    current_occupany = Column(Integer)

class Puppy(Base):
    __tablename__ = 'puppy'
    id = Column(Integer, primary_key=True)
    name = Column(String(250), nullable=False)
    gender = Column(String(6), nullable = False)
    dateOfBirth = Column(Date)
    picture = Column(String)
    shelter_id = Column(Integer, ForeignKey('shelter.id'))
    shelter = relationship(Shelter)
    weight = Column(Numeric(10))
    profile = relationship('Profile', uselist = False, backref='profile')

class Profile(Base):
	__tablename__ = 'profile'
	id = Column(Integer, primary_key=True)
	picture = Column(String)
	description = Column(String)
	needs = Column(String)
	puppy = relationship(Puppy)
	puppy_id = Column(Integer, ForeignKey('puppy.id'))

class Adopter(Base):
	__tablename__ = 'adopter'
	id = Column(Integer, primary_key=True)
	name = Column(String(250), nullable=False)

association_table = Table('association', Base.metadata,
	Column('puppy_id', Integer, ForeignKey('puppy.id')),
	Column('adopter_id', Integer, ForeignKey('adopter.id'))
)

engine = create_engine('sqlite:///puppyshelter.db')

Base.metadata.create_all(engine)