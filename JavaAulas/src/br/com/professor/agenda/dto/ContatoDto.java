package br.com.professor.agenda.dto;

import br.com.professor.agenda.model.Contato;

public class ContatoDto
{
    private boolean mOk;
    private String  mMensagem;
    private Contato mContato;

    public ContatoDto()
    {
        super();
    }

    public ContatoDto(boolean pOk, String pMensagem)
    {
        super();
        mOk = pOk;
        mMensagem = pMensagem;
    }

    public ContatoDto(boolean pOk, String pMensagem, Contato pContato)
    {
        super();
        mOk = pOk;
        mMensagem = pMensagem;
        mContato = pContato;
    }

    public boolean isOk()
    {
        return mOk;
    }

    public void setOk(boolean pOk)
    {
        mOk = pOk;
    }

    public String getMensagem()
    {
        return mMensagem;
    }

    public void setMensagem(String pMensagem)
    {
        mMensagem = pMensagem;
    }

    public Contato getContato()
    {
        return mContato;
    }

    public void setContato(Contato pContato)
    {
        mContato = pContato;
    }

}
