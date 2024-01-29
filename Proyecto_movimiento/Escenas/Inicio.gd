extends Button

func _ready():
	# Obtén la instancia del script actual y conéctalo al método "_on_pressed"
	connect("pressed", self, "_on_pressed")

func _on_pressed():
	# Carga y cambia a la escena del juego
	get_tree().change_scene("res://EscenaDelJuego.tscn")
