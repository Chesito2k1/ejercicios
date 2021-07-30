public class Calcular_Inversion{
    //Atributos
    private int tiempo;
    private double capital;
    private double interes;

    //metodo 
    // constructor
    public Calcular_Inversion(){//sin parametros
        this.tiempo = 0;// hace referencia a la propia clase
        this.capital = 0.0; // es decir a los atributos del esta clase
        this.interes = 0.0;
    }

//constructor con parametros

public Calcular_Inversion(Integer tiempo, Double capital, Double interes){
    this.tiempo = tiempo;/
    this.capital = capital; // 
    this.interes = interes;
}

//metodo para calcular el interes simple
public double calcularInteresSimple(){
    double interesSimple = this.capital * (this.interes / 100) * this.tiempo;
    // Divide entre 100 porque a l ingresar el interes se ingresa como valor entero
    // por ej para 19% se escribe 19 y la division lo convienrte a 0.19 luego }
    // se multiplica por el capital para calclular el interes
    // luego por el tiempo para calcular a lo largo del tiempo
    return interesSimple;
}

public double calcularInteresCompuesto(){
    double interesCompuesto = this.capital *
                             (Math.pow(1 + (this.interes / 100), this.tiempo )- 1);
                             // en este caso PoW es para elevarlo al tiempo
    return Math.round(interesCompuesto);
}

public double comprarInversion(){
    double diferencia = 0;
    diferencia = calcularInteresCompuesto() - calcularInteresSimple();
    return diferencia;

}


// otra forma para instanciar el objeto y calcular la diferencia
public double compararInversion(Integer tiempo, Double capital, Double interes){
    this.tiempo = tiempo;
    this.capital = capital;
    this.interes = interes;

    double diferencia = 0;
    diferencia = calcularInteresCompuesto() - calcularInteresSimple();
    return diferencia;
}

public int getTiempo(){// metodo getter para obtener el valor del atributo tiempo 
    return tiempo;
}

public double getCapital(){// metodo getter para obtener el valor del atributo capital 
    return capital;
}

public double getInteres(){// metodo getter para obtener el valor del atributo interes 
    return interes;
}



public static void main (String[] args){
    Calcular_Inversion inversion1 = new Calcular_Inversion();// se llama la constructor que no tiene parametroas por lo tanto
                                                                // el objeto tenra todos losvalores en ceros
    System.out.println("Capital: " + inversion1.getCapital());
    System.out.println("Interes: " +inversion1.getInteres());
    System.out.println("Tiempo: " +inversion1.getTiempo());


}
}// cierra la clase