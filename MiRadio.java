
public class MiRadio implements Radio
{
	/***atributos***/
	private boolean encendido = false;
	private boolean guardar = true;
	private double [] botones= new double[12];
	private boolean frecuencia = true;
	private double estacion=530;
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
	public double[] getBotones() {
		return botones;
	}
	public void setBotones(double[] botones) {
		this.botones = botones;
	}
	public boolean getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(boolean frecuencia) {
		this.frecuencia = frecuencia;
	}
	public double getEstacion() {
		return estacion;
	}
	public void setEstacion(double estacion) {
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
		if (encendido==true)
		{
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
		
	}
	@Override
	public void Cambio_de_Emisora(boolean a) {
		if (encendido==true){
		// TODO Auto-generated method stub
		{
			boolean F= getFrecuencia();
		}
		
		if (a==true)
		{
			if (frecuencia==true)
			{
				if (estacion%10!=0)
				{
					estacion=530;
				}
			
				if(estacion<1610)
				{
					estacion= estacion+10;
				}
				else
				{
					estacion=530;
				}
			}
			if(frecuencia==false)
			{
				if(estacion%10==0)
				{
					estacion= 87.9;
				}
				
				if(estacion<107.9)
				{
					estacion= estacion+0.2;
				}
				else
				{
					estacion=87.9;
				}
			}
		}
		else {
			if (frecuencia==true)
			{
				if (estacion%10!=0)
				{
					estacion=1610;
				}
			
				if(estacion>530)
				{
					estacion= estacion-10;
				}
				else
				{
					estacion=1610;
				}
			}
			if(frecuencia==false)
			{
				if(estacion%10==0)
				{
					estacion= 107.9;
				}
				
				if(estacion>87.9)
				{
					estacion= estacion-0.2;
				}
				else
				{
					estacion=107.9;
				}
			}}
			
		setEstacion(estacion);
		}
		//return (Math.round(estacion*1000f))/1000f;
	}
	@Override
	public void Guardar_Emisora(int bot) {
		if (encendido==true){
		// TODO Auto-generated method stub
		if (guardar == true)
		{
			double est= getEstacion();
			botones[bot]= est;
		}}
	}
	@Override
	public void Seleccionar_emisora_guardada(int bot) {
		if (encendido==true){
		// TODO Auto-generated method stub
		if (guardar==false)
		{
			double est= botones[bot];
			setEstacion(est);
		}}
		//return (Math.round(estacion*1000f))/1000f;
	}
	@Override
	public void Guardar_seleccion() {
		if (encendido==true){
		// TODO Auto-generated method stub
		if (guardar== true)
		{
			guardar= false;
		}
		else
		{
			guardar= true;
		}}
	}
	@Override
	public double getEmisora() {
		// TODO Auto-generated method stub
		/*double est= estacion*1000;
		Math.round(est);
		return est/1000;*/
		//return (Math.round(estacion*1000))/1000;
		return estacion;
	}
}
