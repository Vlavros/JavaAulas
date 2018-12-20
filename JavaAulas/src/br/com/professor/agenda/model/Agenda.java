package br.com.professor.agenda.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda implements Serializable
{
    private static final long serialVersionUID = 1L;

    private int               mId;
    private LocalDate         mData;
    private LocalTime         mHora;
    private int               mDuracao;
    private String            mEvento;

    public int getId()
    {
        return mId;
    }

    public void setId(int pId)
    {
        mId = pId;
    }

    public LocalDate getData()
    {
        return mData;
    }

    public void setData(LocalDate pData)
    {
        mData = pData;
    }

    public LocalTime getHora()
    {
        return mHora;
    }

    public void setHora(LocalTime pHora)
    {
        mHora = pHora;
    }

    public int getDuracao()
    {
        return mDuracao;
    }

    public void setDuracao(int pDuracao)
    {
        mDuracao = pDuracao;
    }

    public String getEvento()
    {
        return mEvento;
    }

    public void setEvento(String pEvento)
    {
        mEvento = pEvento;
    }

    @Override
    public String toString()
    {
        StringBuilder tBuilder = new StringBuilder();
        tBuilder.append("Agenda [mId=");
        tBuilder.append(mId);
        tBuilder.append(", mData=");
        tBuilder.append(mData);
        tBuilder.append(", mHora=");
        tBuilder.append(mHora);
        tBuilder.append(", mDuracao=");
        tBuilder.append(mDuracao);
        tBuilder.append(", mEvento=");
        tBuilder.append(mEvento);
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
        Agenda other = (Agenda) obj;
        if (mId != other.mId)
            return false;
        return true;
    }
}
