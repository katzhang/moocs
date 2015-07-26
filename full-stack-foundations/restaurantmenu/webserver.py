from BaseHTTPServer import BaseHTTPRequestHandler, HTTPServer
import cgi

from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from database_setup import Base, Restaurant

engine = create_engine('sqlite:///restaurantmenu.db')
Base.metadata.bind = engine
DBSession = sessionmaker(bind=engine)
session = DBSession()

def get_restaurants():
	restaurants = session.query(Restaurant).all()
	for r in restaurants:
		print r.name
	return restaurants

def add_links(id):
	return "<a href='/%s/edit'>Edit</a><br><a href='/%s/delete'>Delete</a>" % (str(id), str(id))

def create_new_restaurant(new_name):
	new_restaurant = Restaurant(name=str(new_name))
	session.add(new_restaurant)
	session.commit()

def rename_restaurant(restaurant_id, new_name):
	session.query(Restaurant).filter(Restaurant.id == restaurant_id).update({"name": new_name}, synchronize_session=False)
	session.commit()


class webserverHandler(BaseHTTPRequestHandler):
	def do_GET(self):
		try:
			if self.path.endswith("/hello"):
				self.send_response(200)
				self.send_header('Content-type', 'text/html')
				self.end_headers()

				output = ""
				output += "<html><body>Hello!"
				output += '''<form method='POST' enctype='multipart/form-data' action='/hello'><h2>What would you like me to say?</h2><input name="message" type="text" ><input type="submit" value="Submit"> </form>'''
				output += "</body></html>"
				self.wfile.write(output)
				print output
				return
			if self.path.endswith("/hola"):
				self.send_response(200)
				self.send_header('Content-type', 'text/html')
				self.end_headers()

				output = ""
				output += "<html><body>Hola!<a href='/hello'>Back to hello!</a>"
				output += '''<form method='POST' enctype='multipart/form-data' action='/hello'><h2>What would you like me to say?</h2><input name="message" type="text" ><input type="submit" value="Submit"> </form>'''
				output += "</body></html>"
				self.wfile.write(output)
				print output
				return

			if self.path.endswith("/restaurants"):
				self.send_response(200)
				self.send_header('Content-type', 'text/html')
				self.end_headers()

				restaurants = get_restaurants()

				output = ""
				output += "<html><body><h1>Restaurants!</h1>"
				output += "</body></html>"
				for restaurant in restaurants:
					output += "<li>" + restaurant.name + "<br> " + add_links(restaurant.id) + "</li>"
				output += '''<a href="/restaurants/new">Create a new restaurant</a>'''
				self.wfile.write(output)
				print output
				return

			if self.path.endswith("/restaurants/new"):
				self.send_response(200)
				self.send_header('Content-type', 'text/html')
				self.end_headers()

				output = ""
				output += "<html><body><h1>Create a new restaurant</h1>"
				output += '''<form method='POST' enctype='multipart/form-data' action='/restaurants/new'><h2>Enter a new restaurant name here: </h2><input name="restaurantname" type="text" ><input type="submit" value="Submit"> </form>'''
				output += "</body></html>"
				self.wfile.write(output)
				print output
				return
			if self.path.endswith("/edit"):
				self.send_response(200)
				self.send_header('Content-type', 'text/html')
				self.end_headers()

				restaurant_id = self.path.split('/')[-2]

				output = ""
				output += "<html><body><h1>Rename a restaurant</h1>"
				output += '''<form method='POST' enctype='multipart/form-data' action='%s/edit'><h2>Enter a new restaurant name here: </h2><input name="newrestaurantname" type="text" ><input type="submit" value="Submit"> </form>''' % restaurant_id
				output += "</body></html>"
				self.wfile.write(output)
				print output
				return
		except:
			self.send_error(404, "File not found: %s" % self.path)

	def do_POST(self):
		try:
			if self.path.endswith("/restaurants/new"):
				ctype, pdict = cgi.parse_header(
				    self.headers.getheader('content-type'))
				if ctype == 'multipart/form-data':
					fields = cgi.parse_multipart(self.rfile, pdict)
					new_name = fields.get('restaurantname')
					create_new_restaurant(new_name[0])
					
					self.send_response(301)
					self.send_header('Content-type', 'text/html')
					self.send_header('Location', '/restaurants')
					self.end_headers()
			if self.path.endswith("/edit"):
				ctype, pdict = cgi.parse_header(
				    self.headers.getheader('content-type'))
				if ctype == 'multipart/form-data':
					fields = cgi.parse_multipart(self.rfile, pdict)
					new_name = fields.get('newrestaurantname')

					restaurant_id = self.path.split('/')[-2]
					rename_restaurant(restaurant_id, new_name[0])
					
					self.send_response(301)
					self.send_header('Content-type', 'text/html')
					self.send_header('Location', '/restaurants')
					self.end_headers()
		except:
			pass

def main():
	try:
		port = 8080
		server = HTTPServer(('', port), webserverHandler)
		print "Web server running on port %s" % port
		server.serve_forever()

	except KeyboardInterrupt:
		print "^C entered, stopping web server..."
		server.socket.close()

if __name__ == '__main__':
	main()