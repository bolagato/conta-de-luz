
package projetocontaluz;

import javax.swing.JOptionPane;

public class Luz {

    public int leituraAnterior;
    public int leituraAtual;
    public double tusd = 0.3;
    public double te = 0.29;
    public double total; 
    public double valorParcial;
    public String corBandeira;
    public int difLeitura;
    
    public int getDifLeitura() {
        return difLeitura;
    }

    public void setDifLeitura(int difLeitura) {
        this.difLeitura = difLeitura;
    }
    
    public double icms = 0.25;
    
    
    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }
      
    
    public int getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public int getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(int leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public double getTusd() {
        return tusd;
    }

    public void setTusd(double tusd) {
        this.tusd = tusd;
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(double valorParcial) {
        this.valorParcial = valorParcial;
    }

    public String getCorBandeira() {
        return corBandeira;
    }

    public void setCorBandeira(String corBandeira) {
        this.corBandeira = corBandeira;
    }

    
    public int leitura (int leituraAnterior, int leituraAtual){
        this.difLeitura = leituraAtual - leituraAnterior;
        return this.difLeitura;
        
    }
    
    public double cobranca (double tusd, double te, double icms) {
    double parcial = (this.difLeitura * tusd) + (this.difLeitura * te);
     this.valorParcial = parcial * icms;
    return this.valorParcial;
}
    public double verificaBandeira () {
        
        
        if(this.difLeitura < 101){
            this.corBandeira = "verde";
        }
        if(this.difLeitura > 100 && this.difLeitura < 151) {
            this.corBandeira = "amarela";  
        }
        if(this.difLeitura > 150 && this.difLeitura < 201) {
            this.corBandeira = "vermelha 1";
        }
        if (this.difLeitura > 200) {
            this.corBandeira = "vermelha 2";
        }
        
       switch (this.corBandeira)  {
           
           case "verde":
               this.total = this.valorParcial + 0;
               break;
            case "amarela":
               this.total = this.valorParcial + 0.013;  
                break;
            case "vermelha 1":
               this.total = this.valorParcial + 0.042;
                break;
            case "vermelha 2":
               this.total = this.valorParcial + 0.062;
                break;
       }
       return this.total;
    }
    public void imprimeConta (){
    JOptionPane.showMessageDialog(null, "Cia Elétrica do THIAGO\n" 
            + "************************\n" 
            + "Consumo Anterior: " + this.leituraAnterior 
            + "\nConsumo Atual: " + this.leituraAtual 
            + "\nQuantidade Consumida:" + this.difLeitura 
            + "\nTarifa Bandeira: " + this.corBandeira 
            + "\nValor Parcial: " + this.valorParcial
            + "\nValor Total: " + this.total) ;
    
}
}
    

