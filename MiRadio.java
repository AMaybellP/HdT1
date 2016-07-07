
public class MiRadio implements Radio
{
	/***atributos***/
	private boolean encendido;
	private float [] botones= new float[12];
	private String frecuencia;
	/*private*/ float estacion;
	
	/***métodos***/
	//constructor
	public MiRadio()
	{
		encendido= false;
	}
	//sets y gets
	public boolean getEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	public float[] getBotones() {
		return botones;
	}
	public void setBotones(float[] botones) {
		this.botones = botones;
	}
	public String getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}
	public float getEstacion() {
		return estacion;
	}
	public void setEstacion(float estacion) {
		this.estacion = estacion;
	}
	//otros
	public void encender()
	{
		setEncendido(true);
	}
	public void apagar()
	{
		setEncendido(false);
	}
	public void cambiar(String frec)
	{
		setFrecuencia(frec);
	}
	
	public float avanzar()
	{
		if (frecuencia.equals("AM"))
		{
			if(estacion<1610)
			{
				estacion= estacion+10;
			}
			else
			{
				estacion=530;
			}
		}
		if(frecuencia.equals("FM"))
		{
			if(estacion<107.9)
			{
				estacion= estacion+0.2f;
			}
			else
			{
				estacion=87.9f;
			}
		}
		return estacion;
	}
	
	public void guardar(int boton, float estacion)
	{
		botones[boton]= estacion;
	}
	
	public float seleccionar(int boton)
	{
		estacion= botones[boton];
		return estacion;
	}
}
