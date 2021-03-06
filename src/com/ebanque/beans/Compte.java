package com.ebanque.beans;


public class Compte {
	
	private int numerocompte,decouvertmaximal,debitmaximal;
	private float solde;
	
	public Compte()
	{
		this.solde = 0;
		this.debitmaximal = 800;
		this.debitmaximal = 1000;
	}
	
	public Compte(float solde, int decouvertmax, int debitmax)
	{
		this.solde = solde;
		this.decouvertmaximal = decouvertmax;
		this.debitmaximal = debitmax;
	}

	// definition des getters
	
	public float getSolde()
	{
		return this.solde;
	}
	public int getDecouvertmaximal()
	{
		return this.decouvertmaximal;
	}
	public int getDebitmaximal()
	{
		return this.debitmaximal;
	}
	public int getNumerocompte()
	{
		return this.numerocompte;
	}
	public boolean getEtat()
	{
		if(this.solde>0){
			return true;
		}else
		{
			return false;
		}
	
	}
	
	public boolean crediter(float montant)
	{
		if(montant>0){
			
			return true;
		}else
		{
			
			return false;
		}
	}
	
	public boolean virrement(float montant, Compte compte_recpeteur)
	{
		if(this.solde-montant>this.decouvertmaximal && (this.getNumerocompte()!=compte_recpeteur.getNumerocompte()))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean retrait (float montant)
	{
		if(montant>this.debitmaximal)
		{
			return false;
		}else
		{
			if(this.solde-montant>this.decouvertmaximal)
			{
				return true;
			}else
			{
				return false;
			}
		}
		
	}
	
	// de finition des setters 
	 
	public void setDebitmaximal(int debit)
	{
		this.debitmaximal = debit;
	
	}
	
	public void setDecouvertmaximal(int decouvert)
	{
		this.decouvertmaximal = decouvert;
	}
	
	public void setNumero(int numero)
	{
		this.numerocompte = numero;
	}
	// fonction toString
	public String toString()
	{
		String text =" N� Compte : "+this.getNumerocompte() + " - Sodle = "+this.getSolde();
		return text;
	}
}
