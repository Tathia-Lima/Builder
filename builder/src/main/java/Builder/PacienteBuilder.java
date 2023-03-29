package Builder;

import java.util.Date;
public class PacienteBuilder {

    private  Paciente paciente;

    public PacienteBuilder(){
        paciente = new Paciente();
    }

    public Paciente build() {
        if (paciente.getCodigo() == 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (paciente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return paciente;
    }
    public PacienteBuilder setCodigo(int codigo){
        paciente.setCodigo(codigo);
        return this;
    }
    public PacienteBuilder setNome(String nome){
        paciente.setNome(nome);
        return this;
    }
    public PacienteBuilder setDataNascimento(Date dataNascimento){
        paciente.setDataNascimento(dataNascimento);
        return this;
    }
    public PacienteBuilder setSexo(String sexo) {
        paciente.setSexo(sexo);
        return this;
    }
    public PacienteBuilder setTipoSanguineo(String tipoSanguineo) {
        paciente.setTipoSanguineo(tipoSanguineo);
        return this;
    }
    public PacienteBuilder setConvenioMedico(String convenioMedico) {
        paciente.setConvenioMedico(convenioMedico);
        return this;
    }
    public PacienteBuilder setNomeMae(String nomeMae) {
        paciente.setNomeMae(nomeMae);
        return this;
    }

    public PacienteBuilder setNomePae(String nomePai) {
        paciente.setNomePai(nomePai);
        return this;
    }
    public PacienteBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        paciente.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }
    public PacienteBuilder setEnderecoNumero(int enderecoNumero) {
        paciente.setEnderecoNumero(enderecoNumero);
        return this;
    }
    public PacienteBuilder setEnderecoComplemento(String enderecoComplemento) {
        paciente.setEnderecoComplemento(enderecoComplemento);
        return this;
    }
    public PacienteBuilder setEnderecoBairro(String enderecoBairro) {
        paciente.setEnderecoBairro(enderecoBairro);
        return this;
    }
    public PacienteBuilder setEnderecoCidade(String enderecoCidade) {
        paciente.setEnderecoCidade(enderecoCidade);
        return this;
    }
    public PacienteBuilder setEnderecoUF(String enderecoUF) {
        paciente.setEnderecoUF(enderecoUF);
        return this;
    }
    public PacienteBuilder setCep(String cep) {
        paciente.setCep(cep);
        return this;
    }
    public PacienteBuilder setTelefone(String telefone) {
        paciente.setTelefone(telefone);
        return this;
    }
    public PacienteBuilder setEmail(String email) {
        paciente.setEmail(email);
        return this;
    }
    public PacienteBuilder setRg(String rg) {
        paciente.setRg(rg);
        return this;
    }
}
