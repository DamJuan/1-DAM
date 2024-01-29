extends CharacterBody2D

@export var speed : float

# Declara la variable animacion_andar aquí para que sea accesible en toda la clase
var animacion_andar : AnimatedSprite2D

func _ready():
	# Asigna la referencia al AnimatedSprite2D
	animacion_andar = $Sprite_personaje

@warning_ignore("unused_parameter")
func _process(delta):
	controlar_movimiento()

func controlar_movimiento() -> void:
	# Configura la velocidad en los ejes x e y
	velocity.x = GlobalMovimiento.get_axis().x * speed
	velocity.y = GlobalMovimiento.get_axis().y * speed

	# Verifica si la velocidad en el eje y es menor que 0 (hacia arriba) para reproducir la animación
	if velocity.y > 0:
		animacion_andar.play("Andar1")
	elif velocity.y < 0:
		animacion_andar.play("Andar2")
	elif velocity.x < 0:
		animacion_andar.play("Andar3")
	elif velocity.x > 0:
		animacion_andar.play("Andar4")
	else:
		animacion_andar.stop()
	# Mueve y desliza el cuerpo del personaje
	move_and_slide()
