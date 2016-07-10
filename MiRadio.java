
public class MiRadio implements Radio
{
	/***atributos***/
	private boolean encendido = false;
	private boolean guardar = true;
	private float [] botones= new float[12];
	private boolean frecuencia = true;
	private float estacion=530f;
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
	public boolean getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(boolean frecuencia) {
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
		if (frecuencia==true)
		{
			setFrecuencia(false);
		}
		else
		{
			setFrecuencia(true);
		}
		
	}
	@Override
	public float Cambio_de_Estacion() {
		// TODO Auto-generated method stub
		{
			boolean F= getFrecuencia();
		}
		
		if (frecuencia==true)
		{
			if (estacion%10!=0)
			{
				estacion=530f;
			}
		
			if(estacion<1610)
			{
				estacion= estacion+10f;
			}
			else
			{
				estacion=530f;
			}
		}
		if(frecuencia==false)
		{
			if(estacion%10==0)
			{
				estacion= 87.90f;
			}
			
			if(estacion<107.9)
			{
				estacion= estacion+0.20f;
			}
			else
			{
				estacion=87.90f;
			}
		}
		setEstacion(estacion);
		return (Math.round(estacion*1000f))/1000f;
	}
	@Override
	public void Guardar_Estacion(int bot) {
		// TODO Auto-generated method stub
		if (guardar == true)
		{
			float est= getEstacion();
			botones[bot]= est;
		}
		
		
	}
	@Override
	public float Seleccionar_estacion_guardada(int bot) {
		// TODO Auto-generated method stub
		if (guardar==false)
		{
			float est= botones[bot];
			setEstacion(est);
		}
		return (Math.round(estacion*1000f))/1000f;
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
