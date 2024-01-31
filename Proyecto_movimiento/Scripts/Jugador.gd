extends CharacterBody2D

@export var speed : float
var animacion_andar : AnimatedSprite2D

func _ready():
	animacion_andar = $Sprite_personaje

@warning_ignore("unused_parameter")
func _process(delta):
	controlar_movimiento()

func controlar_movimiento() -> void:
	velocity.x = GlobalMovimiento.get_axis().x * speed
	velocity.y = GlobalMovimiento.get_axis().y * speed

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

	move_and_slide()
