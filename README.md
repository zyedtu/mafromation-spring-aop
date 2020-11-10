
										SPRING AOP

##### Introduction:  

Typiquement dans une application il y a deux sortes de préocupation:
* Préocupation d'orde fonctionnel: logique métier.
* Préocupation d'ordre technique (les fonctionnalités transversales): comme la Sécurité, Journalisation (Logging), ..    

Avec l'approche Orienté Objet ces fonctionnalitées sont implementées dans chaque classe concernées.  

L'ideal pour une modélisattion logéciel est d'aboutir à une séparation total entre les differtes préocupation d'une application à fin que chaqu'une d'elle puisse évoluer sans impacter l'autre et minimise ainsi le cout de maintenance et d'évolution. 

Pour faire ça il faut reduire meme supprimer les dependances entre ces modules.  

Pour répondre à un besoin de modélisation des fonctionnalités transversales la ** programmation orienté Aspet ** introduit des nouvelles notions complément à celle de l'approche OO, et propose un moyen de centraliser dans une nouvelle entité le code d'une fonctionnalité transversale ce qu'on appelle un **Aspect**.

Le programmation orientée Aspect vient avec un certain nombre de mot clef qui définissent et concrétisent ses concepts.
* Aspect: c'est une entité logiciel qui capture une fonctionnalité transversale à une application, pour avoir un aspet de la sécurité par exemple ou un aspet de journalisation,.. 
* Pointcut (coupure): c'est un endroi dans l'application où est inseré un code transversal par le tisseur d'aspet(Weaver).  
* JoinPoint (Point de jointure): c'est un point dans l'exécution du programme autour du quel un ou plusieurs aspets pouvaient etre ajouter 
* Advice (Greffon): c'est le bloc du code définissant le comportement d'un aspet. 
* Weaver (tisseur): c'est l'outil permettant de réaliser la fusion entre le code metier et une fonctionnalité transversal externalisée sous forme d'aspet, il existe different tisseur open source, les plus connus sont: AspectJ, Spring AOP, ..

AspectJ est le première librairie ayant fourni les composants pour le creation des aspectes en 1995.  
Spring AOP est un complément de la version en cours d'AspectJ, il propose plusieur annotations pour developper et configurer les aspets en utilisant le code Java.
Spring AOP est basé sur AspectJ, pour cela quand on ajoute les dependances de spring AOP on doit obligatoirement ajouter les dependances ApectJ Weaver