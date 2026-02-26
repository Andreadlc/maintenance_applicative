#  Pixel Tracer  
Projet de programmation en C puis en java 
TP1 – Maintenance Applicative  

**Auteurs :**  
Delcros Andrea  
Khaldi Mohamed  

---

#  Présentation du projet

Pixel Tracer est une application développée en langage C permettant la création et la manipulation de formes géométriques en mode texte (terminal).

L’application permet de créer une scène composée de zones de dessin (Area), organisées en calques (Layers), contenant différentes formes géométriques (Shapes).

Le programme fonctionne entièrement via une interface en ligne de commande interactive.

---

#  Structure du dépôt

```
pixel_tracer/
│
├── src/                    # Fichiers sources (.c / .h)
├── images/                 # Diagrammes UML et captures d’écran
├── rapport.md              # Rapport au format Markdown
├── rapport.pdf             # Rapport final exporté en PDF
├── Doxyfile                # Configuration Doxygen
├── Makefile                # Script de compilation
└── README.md               # Ce fichier
```

---

#  Compilation

Se placer dans le dossier du projet :

```bash
cd pixel_tracer
```

Compiler le projet :

```bash
make
```

Si la compilation réussit, l’exécutable est généré dans le dossier courant.

---

#  Lancer l’application

Exécuter le programme avec :

```bash
./pixel_tracer
```

L’application démarre en mode interactif dans le terminal.

---

#  Afficher les commandes disponibles

Une fois l’application lancée, taper :

```bash
help
```

La commande `help` affiche la liste complète des commandes disponibles ainsi que leur description.

---

#  Fonctionnement général

L’application fonctionne selon la logique suivante :

1. Créer une zone de dessin (Area)
2. Sélectionner cette zone
3. Créer un calque (Layer)
4. Sélectionner le calque
5. Créer une forme
6. Afficher la scène

---

#  Étapes pour créer une forme

Voici les étapes complètes pour créer et afficher une forme :

## 1️ Créer une zone de dessin

```bash
new area 
```
L'application nous retourne l'id de l'area crée

Cela crée une zone de dessin de 40x40 caractères par défaut.

---

## 2️ Sélectionner la zone uniquement quand vous créer une nouvelle area 

```bash
select area "ID"
```

Il faut obligatoirement sélectionner une zone avant de créer un calque.

---

## 3️ Créer un calque

```bash
new layer

```
L'application nous retourne l'id du layer crée

---

## 4️ Sélectionner le calque

```bash
select layer "ID"
```

---

## 5 Créer une forme

### ➤ Créer une ligne

```bash
line x1 y1 x2 y2
```

Exemple :

```bash
line 1 1 10 10
```

---

### ➤ Créer un rectangle

```bash
rectangle x y largeur hauteur
```

Exemple :

```bash
create_rectangle 5 5 10 4
```

---

### ➤ Créer un cercle

```bash
circle x y rayon
```

Exemple :

```bash
circle 15 10 5
```

---

## 6 Afficher la scène

```bash
plot
```

La scène complète est alors affichée dans le terminal.

---

#  Exemple complet d’utilisation

```bash
new area
select area "ID"
new layer 
select layer "ID"
line 1 1 15 10
plot
```

---

#  Rapport et documentation

##  Rapport 

Le rapport final est disponible dans :

```
rapport.pdf
```

Une version modifiable est également fournie :

```
rapport.md
```

---

##  Diagrammes UML

Les diagrammes sont disponibles dans le dossier :

```
images/
```

Ce dossier contient :

- Diagramme de dépendances
- Diagramme de composants
- Diagramme de classes
- Captures d’écran de l’application

---

#  Documentation Doxygen

La documentation technique a été générée avec Doxygen.

Pour la régénérer :

```bash
doxygen Doxyfile
```

Les fichiers HTML générés sont accessibles dans :

```
html/
```

Ouvrir ensuite :

```
html/index.html
```

dans un navigateur.

---

#  Outils utilisés

- Langage : C
- Compilation : GCC
- Documentation : Doxygen
- Graphviz (génération des graphes)
- Umbrello / Draw.io (diagrammes UML)

---

#  Objectif pédagogique

Ce projet s’inscrit dans une démarche de maintenance applicative comprenant :

1. Analyse du code existant  
2. Rétro-conception  
3. Production de diagrammes UML  
4. Génération d’une documentation technique  
5. Préparation à une migration vers un modèle orienté objet en Java  

---

#  Remarques importantes

- Le projet compile avec `make`
- L’application fonctionne en mode terminal
- La documentation Doxygen est fonctionnelle
- Les diagrammes sont fournis dans le dossier `images`
- Le rapport respecte les exigences du TP1
