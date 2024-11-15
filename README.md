# SimpleJavaProject

Ce projet Java illustre l'utilisation des patrons de conception **Strategy** et **Singleton**. Il est organisé avec Maven et contient du code de base, y compris des tests unitaires pour les classes de stratégie.

## 📂 Structure du projet

- **src/main/java** : Contient les classes principales du projet, organisées par packages.
  - **patterns/Strategy** : Implémente le pattern Strategy, permettant d'ajouter de nouveaux algorithmes sans modifier le code du client.
    - **Strategy.java** : Interface de la stratégie.
    - **ConcreteStrategyA.java** et **ConcreteStrategyB.java** : Implémentations concrètes de la stratégie.
    - **Context.java** : Classe contextuelle qui utilise une stratégie pour exécuter une opération.
  - **patterns/simpleExample** : Contient des classes d'exemples simples.
    - **SimpleClass.java** : Classe avec des méthodes `add` et `multiply` pour des opérations mathématiques de base.
    - **Singleton.java** : Implémentation du pattern Singleton pour garantir une instance unique de cette classe.

- **src/test/java** : Contient les tests unitaires pour les classes du projet.
  - **ConcreteStrategyATest.java** et **ConcreteStrategyBTest.java** : Tests unitaires pour vérifier le comportement des stratégies concrètes.
  - **ContextTest.java** : Test unitaire pour la classe `Context`.

- **target** : Répertoire de sortie pour les fichiers générés par Maven.

## 🚀 Installation

1. Clonez ce repository :
   ```bash
   git clone https://github.com/<your-username>/SimpleJavaProject.git
   cd SimpleJavaProject
