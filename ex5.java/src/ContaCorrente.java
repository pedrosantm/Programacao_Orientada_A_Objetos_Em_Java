public class ContaCorrente extends ContaBancaria {
        private int transaçoes;
        private float limitecheque;


        public ContaCorrente(String senha, int numero, float saldo, int transacoes) {
            super(senha, numero, saldo); // Chama o construtor da classe pai
            this.transaçoes = transacoes;

        }
        
        public int getTransaçoes() {
            return transaçoes;
        }
        public void setTransaçoes(int transaçoes) {
            this.transaçoes = transaçoes;
        }
        public float getLimitecheque() {
            return limitecheque;
        }
        public void setLimitecheque(float limitecheque) {
            this.limitecheque = limitecheque;
        }


        public void Saca(float diminui){};


        
}
