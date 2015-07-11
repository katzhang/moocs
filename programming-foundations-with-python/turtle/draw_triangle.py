import turtle

def draw_triangle(turtle, length):
	for i in range(1, 4):
		turtle.forward(length)
		turtle.left(120)

def draw_art():
	window = turtle.Screen()

	t = turtle.Turtle()
	t.shape('turtle')

	for i in [1, 2, 4]:
		length = 300 / i
		draw_triangle(t, length)
		# t.forward(length / 2)
		# t.left(60)

	window.exitonclick()

draw_art()