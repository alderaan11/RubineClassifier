# RubineClassifier
Algebra pratical work

Algorithm to classify gestures using Rubine's algorithm.

Pivot de Gauss:

for k de 0 à n-1:
    find p tq (apk) = max(amk)
    switch line p et line k m appartient [k,n+1] => recherche de pivot
    if (akk != 0)
        for (l=0 à n-1):
            akl /= akk
            mkl /= akk
        for (i=0 à n-1):
            if (i != p)
                c = aik
                for j=0 à n-1:
                    aij -= c*akj
                    mij -= c*mkj
    else
        print("Matrice singulière")
        return