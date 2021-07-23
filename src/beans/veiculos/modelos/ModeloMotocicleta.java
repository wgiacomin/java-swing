package beans.veiculos.modelos;

public enum ModeloMotocicleta {
    CG125 {
        @Override
        public String toString() {
            return "CG 125";
        }
    },
    CBR500 {
        @Override
        public String toString() {
            return "CBR 500";
        }
    }
}
