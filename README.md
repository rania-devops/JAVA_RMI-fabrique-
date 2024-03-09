# Rapport :JAVA_RMI-fabrique-
-------->>> PARTIE 1:  **Mise en Œuvre d'une Fabrique d'Inversion de Chaînes avec RMI**

Étape 1 : Définir l'Interface Distante (AppInterface.java):

Création de l'interface RMI avec la méthode distante reverseString.
Importation des classes RMI nécessaires (Remote et RemoteException).

Étape 2 : Implémenter l'Interface Distante (AppImpl.java):

Création d'une classe implémentant l'interface distante.
Utilisation de UnicastRemoteObject pour faciliter l'exposition des méthodes distantes.
Implémentation de la méthode reverseString pour inverser une chaîne de caractères.

Étape 3 : Définir l'Interface de la Fabrique d'Objets (FabInterface.java):

Création de l'interface pour la fabrique d'objets avec la méthode createAppObject.

Étape 4 : Implémenter la Fabrique d'Objets (FabImpl.java):

Création d'une classe implémentant la fabrique d'objets.
Utilisation de UnicastRemoteObject pour faciliter l'exposition des méthodes distantes.
Implémentation de la méthode createAppObject pour créer une instance de AppImpl.

Étape 5 : Créer l'Application Serveur (AppServer.java):

Création d'une application serveur qui instancie la fabrique d'objets et l'enregistre dans rmiregistry.


Étape 6 : Générer les Stubs et Skeletons avec rmic:

Utilisation de la commande rmic pour générer les classes stub et skeleton pour AppImpl et FabImpl.

Étape 7 : Créer l'Application Cliente (AppClient.java):

Création d'une application cliente qui recherche la fabrique d'objets à distance et appelle la méthode distante pour inverser une chaîne.

Étape 8 : Compilation et Exécution:

* Compilation de tous les fichiers Java.
* Démarrage du rmiregistry.
* Exécution du serveur et de la clientèle.

-------->>> PARTIE 2: **Mise en œuvre de Fabriques d'Objets avec RMI :**

QUESTION B  **Mise en œuvre de Fabriques de comptes bancaires :**

1. **Compte Bancaire :**
   - **`banque.CompteBancaireInterface` :** Interface définissant les opérations pour un compte bancaire à distance.
   - **`banque.CompteBancaireImpl` :** Implémentation de l'interface `CompteBancaireInterface`, gérant les opérations bancaires.

2. **Fabrique de Comptes Bancaires :**
   - **`banque.FabriqueCompteBancaireInterface` :** Interface de fabrique décrivant la création d'instances de `CompteBancaire`.
   - **`banque.FabriqueCompteBancaireImpl` :** Implémentation de la fabrique qui crée des instances de `CompteBancaire`.

QUESTION C  **une Fabrique d'Objets pour l'Application RMI "helloApp"**
  
Étapes de Mise en Œuvre :

1/Définition de l'Interface Distante : Une interface Java nommée HelloInterface a été créée pour déclarer les méthodes distantes que le client peut invoquer sur les objets distants. Cette interface contient une méthode sayHello() qui retourne un message de salutation.

2/Implémentation de l'Interface Distante : Une classe HelloImpl a été développée pour fournir l'implémentation des méthodes définies dans l'interface distante. Cette classe hérite de UnicastRemoteObject et implémente HelloInterface. La méthode sayHello() retourne un message de salutation.

3/Définition de l'Interface de la Fabrique d'Objets : Une interface nommée HelloFactoryInterface a été créée pour définir la méthode permettant de créer des instances d'objets distants. Cette interface déclare une méthode createHelloObject().

4/Implémentation de la Fabrique d'Objets : Une classe HelloFactoryImpl a été mise en place pour implémenter l'interface de la fabrique d'objets. Cette classe hérite également de UnicastRemoteObject et implémente HelloFactoryInterface. La méthode createHelloObject() crée une instance de HelloImpl et la retourne.

5/Compilation des Classes : Toutes les classes Java ont été compilées avec succès à l'aide de l'outil de compilation Java.

QUESTION D  **une Fabrique d'Objets pour l'Application RMI "helloApp"**

4. **Compteur :**
   - **`compteur.CompteurInterface` :** Interface définissant les opérations pour un compteur à distance.
   - **`compteur.CompteurImpl` :** Implémentation de l'interface `CompteurInterface`, gérant l'incrémentation et le renvoi de la valeur actuelle.

5. **Fabrique de Compteurs :**
   - **`compteur.FabriqueCompteurInterface` :** Interface de fabrique décrivant la création d'instances de `Compteur`.
   - **`compteur.FabriqueCompteurImpl` :** Implémentation de la fabrique qui crée des instances de `Compteur`.


