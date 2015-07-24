from sqlalchemy import create_engine, update, select
from database_setup import Shelter, Puppy, Adopter, association

# Given a shelter name, update its max capacity
def update_max_capacity_statement(shelter_id, new_num):
	return update(shelter).where(shelter.id == shelter_id).\
				values(max_capacity = new_num)

# Given a shelter name, get its max capacity
def update_max_capacity_statement(shelter_id, new_num):
	return select(shelter).where(shelter.id == shelter_id)

# Adopt a puppy based on its id. Takes in an array of adopter ids
def adopt_puppy(puppy_id, adopter_ids):
	for adopter_id in adopter_ids:
		update(association).where(association.adopter_id == adopter_id).\
		values(association.puppy_id = puppy_id)
	shelter_id = select(puppy.shelter_id).where(puppy.id == puppy_id)

	update(shelter).where(shelter.id == shelter_id).values(shelter.current_occupancy -= 1)




