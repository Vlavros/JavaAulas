package br.com.professor.agenda.model;

import java.io.Serializable;

public class Contato implements Serializable
{
    private static final long serialVersionUID = 1L;

    // Atributos da classe
    private int               mId;
    private long              mTelefone;
    private String            mNome;
    private String            mEmail;
    private String            mEndereco;

    public Contato()
    {
        super();
    }

    public Contato(int pId, long pTelefone, String pNome, String pEmail, String pEndereco)
    {
        super();
        mId = pId;
        mTelefone = pTelefone;
        mNome = pNome;
        mEmail = pEmail;
        mEndereco = pEndereco;
    }



    public int getId()
    {
        return mId;
    }

    public void setId(int pId)
    {
        mId = pId;
    }

    public long getTelefone()
    {
        return mTelefone;
    }

    public void setTelefone(long pTelefone)
    {
        mTelefone = pTelefone;
    }

    public String getNome()
    {
        return mNome;
    }

    public void setNome(String pNome)
    {
        mNome = pNome;
    }

    public String getEmail()
    {
        return mEmail;
    }

    public void setEmail(String pEmail)
    {
        mEmail = pEmail;
    }

    public String getEndereco()
    {
        return mEndereco;
    }

    public void setEndereco(String pEndereco)
    {
        mEndereco = pEndereco;
    }

    @Override
    public String toString()
    {
        StringBuilder tBuilder = new StringBuilder();
        tBuilder.append("Contato [mId=");
        tBuilder.append(mId);
        tBuilder.append(", mTelefone=");
        tBuilder.append(mTelefone);
        tBuilder.append(", mNome=");
        tBuilder.append(mNome);
        tBuilder.append(", mEmail=");
        tBuilder.append(mEmail);
        tBuilder.append(", mEndereco=");
        tBuilder.append(mEndereco);
        tBuilder.append("]");
        return tBuilder.toString();
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + mId;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (mId != other.mId)
            return false;
        return true;
    }
}
