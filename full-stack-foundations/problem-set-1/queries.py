from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from database_setup import Base, Shelter, Puppy
from datetime import date

engine = create_engine('sqlite:///puppyshelter.db')
Base.metadata.bind = engine
DBSession = sessionmaker(bind = engine)
session = DBSession()

# 1. Query all of the puppies and return the results in ascending alphabetical order
puppies = session.query(Puppy).order_by(Puppy.name).all()
# for puppy in puppies:
	# print str(puppy.id) + ' ' + puppy.name + ' ' + str(puppy.dateOfBirth)

# 2. Query all of the puppies that are less than 6 months old organized by the youngest first
today = date.today()
young_puppies = session.query(Puppy).filter(Puppy.dateOfBirth > date(2015, today.month - 6, today.day))
# for puppy in young_puppies:
	# print str(puppy.id) + ' ' + puppy.name + ' ' + str(puppy.dateOfBirth)

# 3. Query all puppies by ascending weight
weighted_puppies = session.query(Puppy).order_by(Puppy.weight).all()
#for puppy in weighted_puppies:
	#print str(puppy.id) + ' ' + puppy.name + ' ' + str(puppy.weight)


# 4. Query all puppies grouped by the shelter in which they are staying
grouped_puppies = session.query(Puppy).order_by(Puppy.shelter_id).all()
for puppy in grouped_puppies:
	print str(puppy.id) + ' ' + puppy.name + ' ' + str(puppy.shelter_id)


