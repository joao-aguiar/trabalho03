/*******************************************************************************************
*                         SCC 604 - Programacao Orientada a Objetos                        *
*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*
*                          Turma 2014/2 - Engenharia de Computação                         *
*                                  Professor: Moacir Ponti                                 *
*------------------------------------------------------------------------------------------*
*                                        Trabalho 3                                        *
*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*
*                      Alunos: João Victor Almeida de Aguiar :: 8503986                    *
*                           Cassiano Zaghi de Oliveira :: 7987400                          *
********************************************************************************************/



package Game;

public class Thief extends GameCharacter
{
	/*  Atributos da classe Thief (todos são protected)  */

	protected int stealth;

	
	/*  Métodos da classe GameCharacter  */

	/***  Construtores e Destrutores  ***/

	/* Construtor que recebe o nome do personagem e stealth, e inicializa suas caracteristicas no mínimo aceitável
	i.e: 100 HP, XP = strength = speed = dexterity = constitution = 1*/
	public Thief(String alias, int stealth)
	{
		super(alias);

		this.stealth = stealth;
	}


	/*  Incrementa o stealth do Thief  */
	public void addStealth(int stealthup)
	{
		this.stealth += stealthup;
	}


	/***  Cálculo dos pontos (todos são protected)  ***/

	/*  Cálculo dos pontos de ataque  */
	protected int getAttackPoints()
	{
		return super.getAttackPoints() + this.stealth;
	}

	/*  Cálculo dos pontos de defesa  */
	protected int getDefensePoints()
	{
		return super.getDefensePoints();
	}

	public void train ()
	{
		int gd = (int) (-1.0*Utils.rnd(0,30));
		int hp = (int) (-1.0*Utils.rnd(0,60));
		int xp = (int) Utils.rnd(0,1);

		myitems.spendGold(gd);
		addHP(hp);
		addXP(xp);

		setStrenght(strenght + 1);
		setSpeed(speed + 1);
	}
}