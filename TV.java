
class TV {
        int tamanhoTela;
        String Marca;
        int vol = 5;
        int tamanho;
        int voltagem;
            int canal;
            boolean ligar = false;
            
            void liga() {
                ligar = true;
                int consumo = voltagem * tamanhoTela;
                System.out.println("TV ligada");
                System.out.println("Consumo: " + consumo);
            }
            void desligar() {
                ligar = false;
                System.out.println("TV desligada");
            }
            int voldown() {
                if(vol > 1) {
                    vol -= 1;
                }
                return vol;
            }
            int volup() {
                if(vol < 10) {
                    vol += 1;
                }
                return vol;
            }
            int canaldown() {
               if(canal > 1) {
                    canal -= 1;
                }
                return canal; 
            }
            int canalup() {
                    canal += 1;
                return canal; 
            }
            
    }
}
