package br.com.lojaa.demo.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empregado")
public class Empregado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEmpregado;
    private String nome;
    private String cpf;
    @ManyToOne
    @JoinColumn(name = "cargo_fk")
    private Cargo cargo;

    private BigDecimal salario;


    public Empregado(){
    }

    public Empregado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }
    public Long getCodigoEmpregado() {
        return codigoEmpregado;
    }
    public void setCodigoEmpregado(Long codigoEmpregado) {
        this.codigoEmpregado = codigoEmpregado;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoEmpregado == null) ? 0 : codigoEmpregado.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = prime * result + ((salario == null) ? 0 : salario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Empregado other = (Empregado) obj;
        if (codigoEmpregado == null) {
            if (other.codigoEmpregado != null)
                return false;
        } else if (!codigoEmpregado.equals(other.codigoEmpregado))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
      
        return true;
    }



    
    
}
