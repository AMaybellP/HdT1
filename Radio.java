// Universidad del Valle de Guatemala
// Algoritmos y Estructura de datos
// Hoja de trabajo # 1
// Seccion 10
// 12/07/16

//Integrantes
// Andrea Maybell Echeverria 15127
// Jose Gerardo Molina 14492
// Diego Lopez 141222


// Se crea una interfaz con los funcionamientos básicos de un radio	
public interface Radio 
{	
	//Método para verificar si está encendido el radio
	public void ON_OFF();
	
	//Método para verificar si el radio se encuentra en AM o FM
	public void AM_FM();
	
	//Método para poder cambiar la emisora
	//@param a boolean para poder verificar el cambio 
	public void Cambio_de_Emisora(boolean a);
	
	//Método para guardar emisora
	//@param x    integer que permite guardar la emisora en un array
	public void Guardar_Emisora(int x);
	
	//Método para separar entre seleccionar y guardar la emisora
	//@param x    integer que permite seleccionar la emisora guardada
	public void Seleccionar_emisora_guardada(int x);
	
	//Método para poder reconocer si se está guardando o seleccionando una estación
	public void Guardar_seleccion();
	
	//Un get para obtener el número de emisora 
	public double getEmisora();
}

