package noncentma.tp04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.Scanner;
import commun.Outils;

public class tp04 {
	@BeforeEach
	void setup() {
		Outils.Aleatoire.resetSeedSet();
		Outils.Aleatoire.setSeed(123);
	}

	@Test
	void test11() {
		int[] nb = { 1, 2, 3, 4, 5 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 0, 16 }, calculScore(nb, pts));
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test12() {
		int[] nb = { 5, 4, 3, 2, 1 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 0, 0 }, calculScore(nb, pts));
		assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test13() {
		int[] nb = { 1, 2, 4, 3, 5 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 4, 0, 1 }, calculScore(nb, pts));
		assertArrayEquals(new int[] { 1, 2, 4, 3, 5 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test14() {
		int[] nb = { 5, 4, 1, 3, 2 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 1, 0 }, calculScore(nb, pts));
		assertArrayEquals(new int[] { 5, 4, 1, 3, 2 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test15() {
		int[] nb = { 1, 2, 2, 3, 1 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 9, 0 }, calculScore(nb, pts));
		assertArrayEquals(new int[] { 1, 2, 2, 3, 1 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test21() {
		int[] nb = { 1, 4, 3, 2, 5 };
		boolean[] dis = { true, true, true, true, true };
		assertEquals(3, pigeTuile(nb, dis));
		assertArrayEquals(new int[] { 1, 4, 3, 2, 5 }, nb);
		assertArrayEquals(new boolean[] { true, true, false, true, true }, dis);
	}

	@Test
	void test22() {
		int[] nb = { 1, 4, 3, 2, 5 };
		boolean[] dis = { true, true, false, true, true };
		assertEquals(1, pigeTuile(nb, dis));
		assertArrayEquals(new int[] { 1, 4, 3, 2, 5 }, nb);
		assertArrayEquals(new boolean[] { false, true, false, true, true }, dis);
	}

	@Test
	void test23() {
		int[] nb = { 1, 4, 3, 2, 5 };
		boolean[] dis = { false, true, false, true, true };
		assertEquals(4, pigeTuile(nb, dis));
		assertArrayEquals(new int[] { 1, 4, 3, 2, 5 }, nb);
		assertArrayEquals(new boolean[] { false, false, false, true, true }, dis);
	}

	@Test
	void test24() {
		int[] nb = { 1, 4, 3, 2, 5 };
		boolean[] dis = { false, false, true, true, false };
		assertEquals(3, pigeTuile(nb, dis));
		assertArrayEquals(new int[] { 1, 4, 3, 2, 5 }, nb);
		assertArrayEquals(new boolean[] { false, false, false, true, false }, dis);
	}

	@Test
	void test25() {
		int[] nb = { 5, 4, 3, 2, 1 };
		boolean[] dis = { true, false, false, false, true };
		assertEquals(5, pigeTuile(nb, dis));
		assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, nb);
		assertArrayEquals(new boolean[] { false, false, false, false, true }, dis);
	}

	@Test
	void test31() {
		assertEquals(25, somme(new int[] { 1, 3, 5, 7, 9 }));
	}

	@Test
	void test32() {
		assertEquals(6, somme(new int[] { 1, 0, 0, 5, 0 }));
	}

	@Test
	void test33() {
		assertEquals(0, somme(new int[] { 0, 0, 0, 0, 0 }));
	}

	@Test
	void test34() {
		assertEquals(8, somme(new int[] { 8 }));
	}

	@Test
	void test35() {
		assertEquals(0, somme(new int[] {}));
	}

	@Test
	void test41() {
		assertEquals(4, maximum(new int[] { 1, 3, 5, 7, 9 }));
	}

	@Test
	void test42() {
		assertEquals(1, maximum(new int[] { 1, 8, 4, 6 }));
	}

	@Test
	void test43() {
		assertEquals(0, maximum(new int[] { 9, 7, 5, 3, 1 }));
	}

	@Test
	void test44() {
		assertEquals(0, maximum(new int[] { 5 }));
	}

	@Test
	void test45() {
		assertEquals(2, maximum(new int[] { 3, 3, 8, 8, 3 }));
	}

	@Test
	void test51() {
		assertEquals(1, trouve(new int[] { 1, 3, 5, 7, 9 }, 3));
	}

	@Test
	void test52() {
		assertEquals(0, trouve(new int[] { 1, 3, 5, 7, 9 }, 1));
	}

	@Test
	void test53() {
		assertEquals(4, trouve(new int[] { 1, 3, 5, 7, 9 }, 9));
	}

	@Test
	void test54() {
		assertEquals(-1, trouve(new int[] { 1, 3, 5, 7, 9 }, 4));
	}

	@Test
	void test55() {
		assertEquals(-1, trouve(new int[] {}, 7));
	}

	public static final int NB_CASES = 7; // Nombre de cases à remplir par partie, maximum 20

	public static void main(String[] args) {
		// A FAIRE (45) : code
		Outils.Aleatoire.setSeed(9531);
		Scanner cl = new Scanner(System.in);
		int[] points = new int[] { 0, 1, 3, 5, 7, 9, 11, 15, 20, 25, 30, 35, 40, 50, 60, 70, 85, 100, 150, 300 };
		int[] tuiles = new int[40];
		char choix;
		int scoreFinal, scoreMaximal;
		scoreMaximal = 0;
		do {
			System.out.print("Sélectionnez le pointage de Base ou Expert ou Quitter : ");
			choix = cl.next().toUpperCase().charAt(0);
			if (choix != 'Q') {
				if (choix == 'E') {
					points[5] = 3;
					points[11] = 20;
					points[16] = 50;
				}
				System.out.print("Distribution des chiffres, soit Classique ou Différents? ");
				choix = cl.next().toUpperCase().charAt(0);
				if (choix == 'C') {
					int[] copieNombre = { 11, 12, 13, 14, 15, 16, 17, 18, 19 };
					for (int j = 0; j < 31; ++j) {
						tuiles[j] = j;
					}
					for (int i = 1; i < copieNombre.length + 1; ++i) {
						tuiles[i + 30] = copieNombre[i - 1];
					}

				} else if (choix == 'D') {
					for (int i = 0; i < 40; ++i) {
						tuiles[i] = i + 1;
					}
				}
				scoreFinal = jouerPartie(cl, tuiles, points);

				if (scoreMaximal < scoreFinal) {
					scoreMaximal = scoreFinal;
					System.out.println(
							"Bravo, vous avez battu votre record! Nouveau score à battre : %03d"
									.formatted(scoreMaximal));
				} else {
					System.out.println("Votre record est : " + scoreFinal);
				}
			}
		} while (choix != 'Q');
		System.out.print("Bonne journée");
	}
	// Déclarer un tableau pour les points et l'initialiser avec les points de base
	// inscrits sur la feuille de pointage disponible dans l'énoncé
	// Créer un tableau de taille quarante pour stocker les tuiles
	// Répéter
	// Si l'usager ne choisit pas de quitter
	// On modifie les trois cases du tableau des points selon le type de pointage
	// choisi
	// On initialise le tableau des tuiles selon la distribution désirée
	// Appel de jouerPartie() et récupération du score final
	// Mise à jour du score maximal si le joueur a fait un nouveau record
	// Tant que le joueur ne choisit pas de quitter
	// Afficher le pointage record et saluer le joueur

	// A FAIRE (14) : code - documentation(/**)
	/**
	 * gere une partie complete de Boutabou
	 * 
	 * @param cl     permet de lire l'entree du joueur
	 * @param tuiles tableau ayant les tuiles disponible dans le tableau
	 * @param points tableau representant les points par rapport au suite de de
	 *               tuiles
	 * @return retourne le nombre total de point de la partie
	 */
	public static int jouerPartie(Scanner cl, int[] tuiles, int[] points) {
		int scoreMaximum;
		int scoreTotal;
		int[] cases;
		int[] score;
		cases = toursDeJeu(cl, tuiles);
		changeJoker(cl, cases);
		score = calculScore(cases, points);
		scoreTotal = somme(score);
		scoreMaximum = score[maximum(score)];
		affiche(cases, '-', '/', -1, "");
		affiche(score, ' ', ' ', 0, "");
		System.out.println(String.format("Total de la partie = %d (%d)", scoreTotal, scoreMaximum));
		return scoreTotal;
		// tuiles et points ne doivent pas être modifiés
		// Déclarer un tableau de cases et de scores, mais ne pas les initialiser
		// Appeler toursDeJeu() et récupérer le tableau de cases
		// Appeler changeJoker()
		// Appeler calculScore() et récupérer le tableau des scores
		// Appeler somme() pour obtenir le score total
		// Appeler maximum() pour obtenir la poisition du score maximal pour une suite
		// Afficher le résultat de la partie
		// Retourner le score total
	}

	// A FAIRE (26) : code - documentation(/**)
	/**
	 * Remplit toutes les cases d’un tableau à l’aide de valeurs tirées au hasard
	 * selon les choix du joueur
	 * 
	 * @param cl     permet de lire l'entree du joueur
	 * @param tuiles represente les tuiles disponible dans le jeu
	 * @return retourne un tableau avec les cases remplit
	 */
	public static int[] toursDeJeu(Scanner cl, int[] tuiles) {
		int[] cases = new int[NB_CASES];
		for (int i = 0; i < cases.length; ++i) {
			cases[i] = -1;
		}

		int[] pos = new int[NB_CASES];
		for (int i = 0; i < pos.length; ++i) {
			pos[i] = i + 1;
		}

		boolean[] tuilesdispo = new boolean[tuiles.length];
		for (int i = 0; i < tuiles.length; ++i) {
			tuilesdispo[i] = true;
		}

		int nombreDeCases = 1;
		do {
			int nombreTuiles = pigeTuile(tuiles, tuilesdispo);
			if (nombreDeCases == 1) {
				for (int i = 0; i < 7; ++i) {
					if (i == 6) {
						System.out.print("__");
					} else {
						System.out.print("__ - ");
					}
				}
				for (int i = 0; i < NB_CASES; ++i) {
					if (i == 0) {
						System.out.print("\n " + pos[i]);
					} else {
						System.out.print("%4s".formatted("") + pos[i]);
					}
				}
			}

			System.out.print("\nPosition d'ajout du nombre " + nombreTuiles + " > ");
			int position = cl.nextInt();

			while (position < 1 || position > 7 || cases[position - 1] != -1) {
				System.out.print("Cette position est invalide, choisissez-en une autre > ");
				position = cl.nextInt();
			}

			for (int i = 0; i < 7; ++i) {

				if (i == position - 1) {
					cases[i] = nombreTuiles;
				}

				if (cases[i] != -1 && nombreDeCases > 1) {
					if (i == 6 && position == 7) {
						System.out.print("%2d".formatted(cases[i]));
					} else {
						System.out.print("%2d".formatted(cases[i]) + " - ");
					}
				} else if (i == position - 1) {
					System.out.print("%2d".formatted(cases[i]) + " - ");
				} else if (i != position - 1 && i != 6) {
					System.out.print("__ - ");
				} else if (i == 6 && position != 7) {
					System.out.print("__");
				}
			}
			for (int i = 0; i < NB_CASES; ++i) {
				if (i == 0) {
					System.out.print("\n " + pos[i]);
				} else {
					System.out.print("%4s".formatted("") + pos[i]);
				}
			}
			nombreDeCases++;

		} while (nombreDeCases != 8);
		System.out.println();
		// tuiles ne doit pas être modifié
		// Initialiser un tableau de cases à -1 ayant pour taille NB_CASES
		// Initialiser un tableau de positions avec les nombres de 1 à NB_CASES
		// Initialiser un tableau tuiles disponibles à vrai (true) de la même taille que
		// tuiles
		// Pour le nombre de cases à remplir, piger une tuile, afficher l'état actuel
		// des cases, demander la position d'ajout au joueur, jusqu'à ce qu'il
		// entre une position valide, et écrire la tuile dans la case.
		// Indice : Les positions du joueur débutent à 1 alors que votre tableau débute
		// à 0
		return cases; // Retourne le tableau de cases rempli
	}

	// A FAIRE (8) : code - documentation(/**)
	/**
	 * methode qui remplace le joker si il est present dans le tableau cases
	 * 
	 * @param cl    permet de lire l'entree du joueur
	 * @param cases le tableau avec les tuiles du joueur
	 */
	public static void changeJoker(Scanner cl, int[] cases) {
		int posJocker = trouve(cases, 0);
		if (posJocker != -1) {
			for (int i = 0; i < NB_CASES; ++i) {
				if (i == posJocker) {
					System.out.print("%2s".formatted("**"));
				} else {
					System.out.print("%2d".formatted(cases[i]));
				}
				if (i < NB_CASES - 1) {
					System.out.print(" - ");
				}
			}

			System.out.print("\nEn quelle valeur voulez-vous changer le JOKER? ");
			int nbChoisi = cl.nextInt();
			cases[posJocker] = nbChoisi;

		}
		System.out.println();
		// Le tableau cases peut être modifié si un JOKER est présent
		// Lire la documentation de l'énoncé et utiliser la fonction trouve()
	}

	// A FAIRE (13) : code - documentation(/**)
	/**
	 * Inscrit dans un tableau le nombre de points obtenus pour chaque suite
	 * croissante de nombres identifiée dans le tableau cases
	 * 
	 * @param cases  tableau avec toutes les tuiles du joueur apres joker
	 * @param points tableau des point pour les suites
	 * @return retourne un tableau representant le score de chaque suites
	 */
	public static int[] calculScore(int[] cases, int[] points) {
		int[] score = new int[cases.length];
		for (int i = 0; i < score.length; ++i) {
			score[i] = 0;
		}
		int longueurSuite = 1;
		for (int i = 0; i < cases.length - 1; ++i) {
			if (cases[i] <= cases[i + 1]) {
				longueurSuite++;
			} else {
				score[i] = points[longueurSuite - 1];
				longueurSuite = 1;
			}
		}
		score[cases.length - 1] = points[longueurSuite - 1];
		return score;
		// cases et points ne doivent pas être modifiés
		// Aucun affichage n'est réalisé par cette fonction
		// Initialiser à zéro un tableau de scores de la même taille que le tableau
		// cases
		// Initialiser la longueur de la suite à 1
		// Pour chaque paire de cases adjacentes, vérifier s'il s'agit de la fin
		// d'une suite et faire le traitement approprié
		// Ne pas oublier d'écrire les points de la dernière suite
		// Retourne le tableau des scores créé
	}

	// A FAIRE (8) : code - documentation(/**)
	/**
	 * Sélectionne une tuile au hasard, parmi celles disponibles, et retourne sa
	 * valeur
	 * 
	 * @param tuiles     tableau contenant les valeurs de chacune des tuiles
	 * @param disponible tableau representant les tuiles disponible
	 * @return retourne la valeur de la tuile pigee dans tableau tuile
	 */
	public static int pigeTuile(int[] tuiles, boolean[] disponible) {
		int tuilesHasard;
		boolean verification = false;
		for (int i = 0; i < disponible.length; ++i) {
			if (disponible[i]) {
				verification = true;
			}
		}
		tuilesHasard = -1;
		if (verification) {
			do {
				tuilesHasard = Outils.Aleatoire.nextInt(tuiles.length);
			} while (!disponible[tuilesHasard]);
			disponible[tuilesHasard] = false;
		}

		// Seul tuiles ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Lire la documentation de l'énoncé et utiliser Outils.Aleatoire
		// Indice : Ne pas oublier de mettre la tuile pigée à
		// false dans le tableau disponible
		return tuiles[tuilesHasard]; // Retourne la valeur de la tuile pigée
	}

	// A FAIRE (15) : code - documentation(/**)
	/**
	 * Affiche le contenu du tableau tab, reçu en paramètre en utilisant les
	 * séparateurs indiqués entre les éléments
	 * 
	 * @param tab  le tableau des tuiles a afficher
	 * @param sepC valeur a afficher si la valeur est croissante
	 * @param sepD valeur a afficher si la valeur est decroissante
	 * @param val  valeur a rechercher dans le tableau tab
	 * @param rem  le texte a remplacer le chiffre avec
	 */
	public static void affiche(int[] tab, char sepC, char sepD, int val, String rem) {
		char caractere;
		if (val == -1) {
			if (tab[0] == val) {
				System.out.print(rem);
			} else {
				System.out.print("%2d".formatted(tab[0]));
			}
			for (int i = 0; i < tab.length - 1; i++) {
				if (tab[i] <= tab[i + 1]) {
					caractere = sepC;
				} else {
					caractere = sepD;
				}
				System.out.print(" " + caractere + " ");
				if (tab[i + 1] == val) {
					System.out.print(rem);
				} else {
					System.out.print("%2d".formatted(tab[i + 1]));
				}
			}
		} else {
			for (int i = 0; i < tab.length; i++) {
				if (tab[i] == 0) {
					System.out.print("   ");
				} else if (tab[i] > 0 && tab[i] == 0) {
					System.out.print("   ");
				} else {
					System.out.print("%4d".formatted(tab[i]));
				}
			}
		}

		System.out.println();
	}
	// tab ne doit pas être modifié
	// Lire la documentation de l'énoncé et utiliser String.formatted()
	// Indice : Faire un cas spécial pour le premier élément qui ne
	// doit pas être précédé d'un séparateur

	// A FAIRE (6) : code - documentation(/**)
	/**
	 * Calcule et retourne la somme des valeurs contenues dans le tableau vecteur
	 * 
	 * @param vecteur tableau qui detiens le score des suites
	 * @return retourne la somme des valeurs du tableau vecteur
	 */
	public static int somme(int[] vecteur) {
		// vecteur ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		int somme = 0;
		for (int i = 0; i < vecteur.length; ++i) {
			somme += vecteur[i];
		}
		return somme; // Retourne une valeur
	}

	// A FAIRE (8) : code - documentation(/**)
	/**
	 * Recherche la valeur maximale contenue dans le tableau vecteur
	 * 
	 * @param vecteur tableau qui detiens le score des suites
	 * @return retourne la valeur maximal dans le tableau
	 */
	public static int maximum(int[] vecteur) {
		int posMax = 0;
		for (int i = 1; i < vecteur.length; ++i) {
			if (vecteur[i] > vecteur[posMax]) {
				posMax = i;
			}
		}
		return posMax;
		// vecteur ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		// Retourne une position
	}

	// A FAIRE (9) : code - documentation(/**)
	/**
	 * Recherche la valeur reçue en paramètre dans le tableau vecteur
	 * 
	 * @param vecteur tableau dans lequel chercher la valeur
	 * @param valeur  valeur a rechercher dans le tableau
	 * @return retourne la position de la première occurrence trouvée ou -1 si la
	 *         valeur est absente
	 */
	public static int trouve(int[] vecteur, int valeur) {
		// vecteur ne doit pas être modifié
		int pos = 0;
		while (pos < vecteur.length && vecteur[pos] != valeur) {
			++pos;
		}
		if (pos == vecteur.length) {
			pos = -1;
		}
		return pos;
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		// Retourne une position
	}
}