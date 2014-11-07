public class No{

    /**
     * Atributos
     */
    public int codigo;
    public No esquerda; // Importante!
    public No direita; // Importante!

    /**
     * Setters
     */
    public No setCodigo(int codigo)
    {
        this.codigo = codigo;
        return this;
    }

    public No setEsquerda(No esquerda)
    {
        this.esquerda = esquerda;
        return this;
    }

    public No setDireita(No direita)
    {
        this.direita = direita;
        return this;
    }

    /**
     * Getters
     */
    public int getCodigo()
    {
        return this.codigo;
    }

    public No getEsquerda()
    {
        return this.esquerda;
    }

    public No getDireita()
    {
        return this.direita;
    }
}
