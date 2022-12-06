# AOP-Aspect-Oriented-Programming-With-Spring-AOP
▸ La programmation orientée aspect (AOP) complète la programmation orientée objet (OOP) en offrant une autre façon de penser la structure du programme.<br>
▸ Les aspects permettent la modularisation et la séparation des préoccupations transversales qui relèvent des exigences techniques et les préoccupations fonctionnelles qui relèvent du métier.<br>
▸ L'un des composants clés de Spring Framework est Spring AOP.<br>
▸ Spring AOP complète Spring IoC pour fournir une solution middleware très performante.<br>
▸ L’approche de Spring AOP diffère de celle de la plupart des autres Framework AOP comme AspectJ. Le but n'est pas de fournir l'implémentation complète des différentes possibilités de l’AOP, mais plutôt de fournir une intégration étroite entre l'implémentation AOP et Spring IoC pour aider à résoudre les problèmes courants dans les applications d'entreprises. <br>
▸ Spring intègre de manière transparente Spring AOP et IoC avec AspectJ, pour permettre à toutes les utilisations d'AOP d'être prises en compte dans une architecture d'application cohérente basée sur Spring.<br>
▸ Spring AOP utilise par défaut des proxys dynamiques JDK standard pour les proxys AOP. Cela permet à n'importe quelle interface (ou ensemble d'interfaces) d'être mandatée.<br>
▸ Spring AOP peut également utiliser des proxys CGLIB. Cela est nécessaire pour créer des proxy pour des classes plutôt que des interfaces.
<br><br>
<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/205914719-c38e03ff-84e2-4d79-bb17-8782c24eebc1.png" width="500" height="500"/> 
</p>

## L'application créée dans ce repository offre deuxfonctionnalités métiers basiques:

• Une opération process() permettant d’effectuer un traitement quelconque <br>
• Une opération permettant de retourner un résultat de calcul quelconque. <br>
▸Nous définissons dans cette couche métier :<br>
&ensp;&ensp;&ensp;&ensp;• Une interface IMetier<br>
&ensp;&ensp;&ensp;&ensp;• Une implémentation de cette interface<br>
▸Ensuite nous définissons deux aspects basés sur Spring AOP<br>
&ensp;&ensp;&ensp;&ensp;• Un Aspect pour la journalisation avec un annotation @Log qui permet de marquer dans la couche la méthode à journaliser<br>
&ensp;&ensp;&ensp;&ensp;• Un Aspect pour sécuriser l’application avec un authentification basique avec des rôles. Pour sécuriser l’accès à une méthode, nous définissons une annotation @SecuredByAspect(roles=["ADMIN","USER"]) qui sera placée sur les méthodes à sécuriser en spécifiant les rôles requis.<br>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/205922641-4fb67df8-3ba1-44b1-90b1-4514cc23879b.png" width="500" height="500"/> 
</p>

** Lien de la vidéo sur Youtube de Professeur Mr YOUSSFI Mohamed pour implémenter ce projet : **<br>
** https://www.youtube.com/watch?v=NLhjdiFq63I **
