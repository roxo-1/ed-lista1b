//Carolina Lee - 
class Palindromo{
    private String texto;

    public Palindromo(){
    texto="";
    }

    public Palindromo (String texto) {
        this.setTexto(texto); 
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        if(texto == null){
            this.texto = "";
        } else {
            this.texto = texto;
        }
    }

    // public boolean verificar(){
    //     if(texto.length() <= 1) return true;

    //     String aux = texto.toLowerCase();
    //     aux = aux.replaceAll(" ","");

    //     for(int i=0; i<aux.length()/2; i++){
    //         int pos1 = i;
    //         int pos2 = (aux.length()-1) -i;
    //         if (aux.charAt(pos1) != aux.charAt(pos2)) return false;
    //     }
    // }

    public boolean verificar() {
        if (texto == null || texto.length() <= 1) return true;
    
        String aux = texto.toLowerCase().replaceAll(" ", ""); // Removendo espaços e padronizando
        int length = aux.length();
    
        for (int i = 0; i < length / 2; i++) {
            if (aux.charAt(i) != aux.charAt(length - 1 - i)) {
                return false;
            }
        }
        
        return true; // Se passou pelo loop, é palíndromo
    }
    
}
