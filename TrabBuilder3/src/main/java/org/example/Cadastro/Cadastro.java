package org.example.Cadastro;

import java.util.Date;

    public class Cadastro {

        private int cpf;
        private String nome;
        private Date dataNascimento;
        private String nomeMae;
        private String nomePai;
        private String rg;
        private String cep;
        private String enderecoLogradouro;
        private int enderecoNumero;
        private String enderecoComplemento;
        private String enderecoBairro;
        private String email;
        private String celular;

        public Cadastro() {
            this.cpf = 0;
            this.nome = "";
        }

        public int getCpf() {
            return cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Date getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(Date dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public String getNomeMae() {
            return nomeMae;
        }

        public void setNomeMae(String nomeMae) {
            this.nomeMae = nomeMae;
        }

        public String getNomePai() {
            return nomePai;
        }

        public void setNomePai(String nomePai) {
            this.nomePai = nomePai;
        }
        public String getRg() {
            return rg;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getEnderecoLogradouro() {
            return enderecoLogradouro;
        }

        public void setEnderecoLogradouro(String enderecoLogradouro) {
            this.enderecoLogradouro = enderecoLogradouro;
        }

        public int getEnderecoNumero() {
            return enderecoNumero;
        }

        public void setEnderecoNumero(int enderecoNumero) {
            this.enderecoNumero = enderecoNumero;
        }

        public String getEnderecoComplemento() {
            return enderecoComplemento;
        }

        public void setEnderecoComplemento(String enderecoComplemento) {
            this.enderecoComplemento = enderecoComplemento;
        }

        public String getEnderecoBairro() {
            return enderecoBairro;
        }

        public void setEnderecoBairro(String enderecoBairro) {
            this.enderecoBairro = enderecoBairro;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCelular() {
            return celular;
        }

        public void setCelular(String celular) {
            this.celular = celular;
        }
    }
}
