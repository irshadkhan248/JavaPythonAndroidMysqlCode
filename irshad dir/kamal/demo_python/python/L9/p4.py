## wapp to water reminder
import time 
import webbrowser
import pygame
while True:
	time.sleep(15)
	print("drink water")
	webbrowser.open("www.google.com")
	pygame.mixer.init()
	pygame.mixer.music.load("song.mp3")
	pygame.mixer.music(1)
	# time.sleep(3)
	# pygame.mixer.music.stop()