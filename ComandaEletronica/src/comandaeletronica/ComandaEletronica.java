/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comandaeletronica;

/**
 *
 * @author gabriel
 */
public class ComandaEletronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class Produto{
        private String codigo;
        private String descricao;
        private Double precoUnitario;

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public Double getPrecoUnitario() {
            return precoUnitario;
        }

        public void setPrecoUnitario(Double precoUnitario) {
            this.precoUnitario = precoUnitario;
        }
        
        
        public void cadastrar(String codigo, String descricao, Double precoUnitario){
        this.codigo=codigo;
        this.descricao=descricao;
        this.precoUnitario=precoUnitario;
    }
    }
    public class Comanda{
        
    }
    public class Itemcomanda{
        
    }
}
