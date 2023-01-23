import random
import time

# declaration d'une liste et on initialise
tab = []

# on parcourt la liste de taille n soit n est entré dans le pour la remplir de nombre àléatoire 
for i in range(10000):

  # les nombres aléatoires sont compris entre 1 et 100
  tab.append(random.randint(1, 100))
  
#print ("Le tableau avant le tri:")
#for i in range(len(tab)): 
#    print ("% d" % tab[i])
  
start = time.time()

#fonction qui prend en paramètre le tableau
def tri_insertion(tab): 
    # Parcour de 1 à la taille du tab
    for i in range(1, len(tab)): 
        pivot = tab[i] 
        j = i-1
        while j >= 0 and pivot < tab[j] : 
                tab[j + 1] = tab[j] 
                j -= 1
        tab[j + 1] = pivot
      
tri_insertion(tab) 
#print ("Le tableau trié est:")
#for i in range(len(tab)): 
#    print ("% d" % tab[i]) 
  
print(time.time() - start)