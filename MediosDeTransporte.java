public class MediosDeTransporte {
    public static class Medio_de_transporte {
        private String marca, modelo, color;
        private int cilindraje;

        public Medio_de_transporte(String marca, String modelo, String color, int cilindraje) {
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
            this.cilindraje = cilindraje;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getCilindraje() {
            return cilindraje;
        }

        public void setCilindraje(int cilindraje) {
            this.cilindraje = cilindraje;
        }
    }

    public static class Motocicleta extends Medio_de_transporte {
        private String placa;
        private int Kilometraje;

        public Motocicleta(String placa, int Kilometraje, String marca, String modelo, String color, int cilindraje) {
            super(marca, modelo, color, cilindraje);
            this.placa = placa;
            this.Kilometraje = Kilometraje;
        }

        public void Mostrar() {
            System.out.println("Marca: " + getMarca() +
                    "\nModelo: " + getModelo() +
                    "\nCilindraje: " + getCilindraje() +
                    "\nColor: " + getColor() +
                    "\nPlaca: " + placa +
                    "\nKm: " + Kilometraje);
        }
    }

    public static class Automovil extends Medio_de_transporte {
        private String placa;
        private int km;

        public Automovil(String placa, int km, String marca, String modelo, String color, int cilindraje) {
            super(marca, modelo, color, cilindraje);
            this.placa = placa;
            this.km = km;
        }

        public void Mostrar() {
            System.out.println("Marca: " + getMarca() +
                    "\nModelo: " + getModelo() +
                    "\nCilindraje: " + getCilindraje() +
                    "\nColor: " + getColor() +
                    "\nPlaca: " + placa +
                    "\nKm: " + km);
        }
    }

    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta("GRH-94D", 90, "YAMAHA", "2010", "NEGRO", 2);
        moto.Mostrar();
        System.out.println("\nAutomovil: \n");
        Automovil auto = new Automovil("GGR-956", 150, "MAZDA", "2021", "GRIS PLATEADO", 4);
        auto.Mostrar();
    }
}
