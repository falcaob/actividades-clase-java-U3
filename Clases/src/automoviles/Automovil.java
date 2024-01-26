package automoviles;

public class Automovil {
	
		//ATRIBUTOS DE LA CLASE***************
		private String matricula; //matrícula del vehículo
		private String marca; //marca del vehículo
		private String color; //color del vehículo
		private int nAnyos; //antigüedad en años del vehículo
		private double velocidad; //velocidad actual del vehículo
		private String tipoCombustible; //indica si el coche es gasolina o diesel
		
		//no dependen del objeto coche 
		//STATIC ES ALGO COMÚN EN TODA LA CLASE
		private static double precioGasolina; //atributo estático común a todos los coches
		private static double precioGasoil; //atributo estático común a todos los coches
		
		
		//CONSTRUCTORES DE LA CLASE************************
		//Métodos que nos permiten construir objetos de la clase
		
		//Constructor por defecto
		public Automovil() {
		}
		
		//Constructor para nuevos automoviles de los que conozco la matrícula 
		public Automovil(String matricula) {
			//asignale al atributo matricula de esta clase, el objeto matricula que le paso por paramtros
			this.matricula = matricula;	
		}
		
		//Constructor para nuevos automoviles
		//de los que conozco la matrícula y la marca
		public Automovil(String matricula, String marca) {
			
			this.matricula = matricula;
			this.marca = marca;
		}
		
		//Constructor para nuevos automoviles
		//de los que conozco todos los datos
		public Automovil(String matricula, String marca, String color, int nAnyos, double velocidad) {
			this.matricula = matricula;
			this.marca = marca;
			this.color = color;
			this.nAnyos = nAnyos;
			this.velocidad = velocidad;
		}
		
		
		//Constructor con todos los atributos
		public Automovil(String matricula, String marca, String color, int nAnyos, double velocidad, String tipoCombustible) {
			this(matricula, marca, color, nAnyos, velocidad);
			this.setTipoCombustible(tipoCombustible);
		}
		
		
		//GETTERS Y SETTERS***************************
		//Métodos que nos permiten obtener y establecer
		//los valores de los atributos
		
		public String getMatricula() { return this.matricula; }
		public void setMatricula(String matricula) { this.matricula = matricula; }
		
		public String getMarca() { return this.marca; }
		public void setMarca(String marca) { this.marca = marca; }
		
		public String getColor() { return this.color; }
		public void setColor(String color) { this.color = color; }
		
		public int getNAnyos() { return this.nAnyos; }
		public void setNAnyos(int nAnyos) { this.nAnyos = nAnyos;}
		
		public double getVelocidad() { return this.velocidad; }
		public void setVelocidad(double velocidad) { this.velocidad = velocidad;}
		
		public String getTipoCombustible() {
			return tipoCombustible;
		}

		public void setTipoCombustible(String tipoCombustible) {
			
			//Si tipoCombustible no es "Gasolina" o "Diesel" entonces no es combustible correcto
			if(tipoCombustible.equalsIgnoreCase("Gasolina") || tipoCombustible.equalsIgnoreCase("Diesel") ) {		
				this.tipoCombustible = tipoCombustible;
			}
			else {
				System.out.println("No es correcto");
			}
				
		}
		
		public static double getPrecioGasolina() {return precioGasolina;}
		public static void setPrecioGasolina(double precioGasolina) {Automovil.precioGasolina = precioGasolina;}
		
		public static double getPrecioGasoil() {return precioGasoil;}
		public static void setPrecioGasoil(double precioGasoil) {Automovil.precioGasoil = precioGasoil;}
		
		
		//MÉTODOS DE INSTANCIA***************************

		//Método que muestra los datos de un objeto de la clase Automovil
		//porque es invocado desde un objeto
		public void mostrarDatos() {
			System.out.println("\nLos datos de este coche son:");
			System.out.println("Matrícula: "+this.getMatricula());
			System.out.println("Marca: "+this.getMarca());
			System.out.println("Color: "+this.getColor());
			System.out.println("Antigüedad: "+this.getNAnyos()+" años");
			System.out.println("Velocidad actual: "+this.getVelocidad()+" km/h");
			System.out.println("Tipo de combustible: " + this.getTipoCombustible()+" km/h");
		}
		
		//Método que arranca un coche
		//Lo pone a 10 km/h 
		public void arrancar() {
			//this.velocidad = 10.0;
			this.setVelocidad(10);
		}
		
		
		//Método que acelara un automovil
		//un número determinado de km/h que le indicamos como argumento
		public void acelerar (double aceleracion) {
			
			this.setVelocidad(this.getVelocidad()+aceleracion);
			
			//this.velocidad = this.velocidad + aceleracion;
		}
		
		//Método que frena un automóvil
		//un número determinado de km/h que le indicamos como argumento
		public void frenar(double frenado) {
			
			this.setVelocidad(this.getVelocidad()-frenado);
			
			//this.velocidad = this.velocidad - frenado;
		}
		
		//Método que pinta un coche del color que le indicamos
		public void pintarCoche(String color) {
			if (this.getColor() == color) {
				System.out.println("\nEl coche ya es de ese color.\nNo se va a pintar");
			} else {
				this.setColor(color);
				System.out.println("\nHemos pintado el coche de "+color);
			}	
	
		}
		
		//MÉTODOS ESTÁTICOS***************************
		//métodos que nos permite asignar un nuevo valor a la gasolina
		public static void nuevoPrecioGasolina(double precioGasolina) {
			setPrecioGasolina(precioGasolina);
		}
		
		public static void nuevoPrecioGasoil(double precioGasoil) {
			setPrecioGasolina(precioGasolina);
		}
		
}
