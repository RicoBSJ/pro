package com.sdzee.pro.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.sdzee.pro.beans.Utilisateur;

public final class ConnexionForm {

	private static final String CHAMP_EMAIL = "email";
	private static final String CHAMP_PASS = "motdepasse";

	private String resultat;
	private Map<String, String> erreurs = new HashMap<String, String>();

	public String getResultat() {
		return resultat;
	}

	public Map<String, String> getErreurs() {
		return erreurs;
	}

	public Utilisateur connecterUtilisateur(HttpServletRequest request) {
		/* Récupération des champs du formulaire */
		String email = getValeurChamp(request, CHAMP_EMAIL);
		String motDePasse = getValeurChamp(request, CHAMP_PASS);

		Utilisateur utilisateur = new Utilisateur();

		/* Validation du champ email */
		try {
			validationEmail(email);
		} catch (Exception e) {
			setErreur(CHAMP_EMAIL, e.getMessage());
		}
		Utilisateur.setEmail(email);

		/* Validation du champ mot de passe */
		try {
			validationMotDePasse(motDePasse);
		} catch (Exception e) {
			setErreur(CHAMP_PASS, e.getMessage());
		}
		Utilisateur.setMotDePasse(motDePasse);

		/* Initialisation du résultat global de la validation */
		if (erreurs.isEmpty())

		{
			resultat = "Succès de la connexion.";
		} else {
			resultat = "Echec de la connexion.";
		}

		return utilisateur;
	}

	/**
	 * Valide l'adresse email saisie.
	 */
	private void validationEmail(String email) throws Exception {
		
	}
}
