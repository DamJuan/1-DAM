extends CanvasLayer

func _on_iniciar_pressed():
	# Lógica para iniciar el juego
	get_tree().change_scene_to_file("res://Escenas/menu.tscn")

func _on_salir_pressed():
	# Lógica para salir de la aplicación
	get_tree().quit()
