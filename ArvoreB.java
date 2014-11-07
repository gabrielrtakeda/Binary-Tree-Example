public class ArvoreB{

    /**
     * Atributos
     */
    private No raiz; // Importante

    /**
     * Construtores
     */
    public ArvoreB(){
        // Inicializa a raíz vazia.
        raiz = null;
    }

    /**
     * Métodos
     */
    public void inserir(int codigo)
    {
        // Criar Nó Tempoŕário
        No no = new No();
        no.codigo = codigo;
        no.esquerda = null;
        no.direita = null;

        // Verificar se árvore está vazia
        if(raiz == null){
            raiz = no; // Inseriu
            return;
        }
        //Andar nos Nós
        No noTemporario = raiz;
        while (noTemporario != null){
            if(codigo == noTemporario.codigo){
                return; // Nó já existe!! Abandona.
            }
            if(codigo < noTemporario.codigo){
                // Verificar lado esquerdo
                if (noTemporario.esquerda == null){
                    noTemporario.esquerda = no; // Insere na esquerda.
                    return;
                }
                noTemporario = noTemporario.esquerda; // Anda para a esquerda.
            } else {
                // Verificar lado direito.
                if(noTemporario.direita == null){
                    noTemporario.direita = no; // Insere na direita.
                    return;
                }
                noTemporario = noTemporario.direita; // Anda para a direita.
            }
        }
    }

    public Boolean busca(int c)
    {
        No noTemporario = raiz;
        while (noTemporario != null){
            if (c == noTemporario.codigo){
                return true;
            }
            if (c < noTemporario.codigo){
                noTemporario = noTemporario.esquerda; // Anda para a esquerda.
            } else {
                noTemporario = noTemporario.direita; // Anda para a direita.
            }
        }
        return false;
    }
}


