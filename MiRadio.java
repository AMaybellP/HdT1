public class MiRadio implements Radio
{
	/***atributos***/
	private boolean encendido;
	private boolean guardar;
	private float [] botones= new float[12];
	private String frecuencia;
	private float estacion;
	private int boton;
	
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
	public int getBoton() {
		return boton;
	}
	public void setBoton(int boton) {
		this.boton = boton;
	}
	//otros
	/*public void cambiar(String frec)
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
	}*/
	
	public void guardar(int boton, float estacion)
	{
		botones[boton]= estacion;
	}
	
	public float seleccionar(int boton)
	{
		estacion= botones[boton];
		return estacion;
	}
	@Override
	public void ON_OFF() {
		// TODO Auto-generated method stub
		boolean en= getEncendido(); 
		if (en==true)
		{
			setEncendido(false);
		}
		else
		{
			setEncendido(true);
		}	
	}
	@Override
	public void AM_FM() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Cambio_de_Estacion() {
		// TODO Auto-generated method stub
		{
			boolean F= getFrecuencia();
		}
		
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
	}
	@Override
	public void Guardar_Estacion() {
		// TODO Auto-generated method stub
		if (guardar == true)
		{
			float est= getEstacion();
			int bot= getBoton();
			botones[bot]= est;
		}
		
		
	}
	@Override
	public void Seleccionar_estacion_guardada() {
		// TODO Auto-generated method stub
		if (guardar==false)
		{
			int bot= getBoton();
			float est= botones[bot];
			setEstacion(est);
		}
	}
	@Override
	public void Guardar_seleccion() {
		// TODO Auto-generated method stub
		if (guardar== true)
		{
			guardar= false;
		}
		else
		{
			guardar= true;
		}
	}
}
