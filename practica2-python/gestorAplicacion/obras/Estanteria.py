class Estanteria: #serializacion ?
    # serialversion ?

    #atributos de clase
    _lista = []
    _numeroEstanterias = len(_lista)

    #Constructor
    def __init__(self, numero =0,piso=0, limites=None, publicaciones=None) :
        Estanteria._numeroEstanterias+=1
        self.numero = numero
        self.piso = piso
        if limites is None:
            self.limites=[]
        else:
            self.limites = limites
        if publicaciones is None:
            self._publicaciones = [] 
        else:
            self._publicaciones = publicaciones
        
        Estanteria._lista.append(self)
        
            

    #Metodos
    @classmethod
    def eliminarEstanteria(cls,E):
        Estanteria._lista.remove(E)
        del E
    @classmethod
    def mostrarRegistros(cls):
        c = "Estanterias creadas "+ "\n"
        for x in Estanteria._lista :
            c= c + f'Estanteria (CP)#{x.getNumero()}, Piso#{x.getPiso()} Limites: {x.getLimites()} \n'
        return c

    '''def mostrarInfo(self):
        return f'INFORMACION DE LA ESTANTERIA: \n Numero: {self.getNumero()} \n Limites: {self.getLimites()} \n Piso: {self.getPiso()}'''

    def mostrarContenido(self):
        from gestorAplicacion.obras.Libro import Libro
        from gestorAplicacion.obras.Revista import Revista
        from gestorAplicacion.obras.Folleto import Folleto
        c=""
        for i,x in enumerate(self._publicaciones):
            c= c + str(i) + f'. {x.getNombre()} Codigo {x.getCodigo()} \n '
        if not self._publicaciones:
            c= "Estanteria vacia"
        elif isinstance(self._publicaciones[0], Libro):
            c="La Estanteria contiene los siguientes libros \n " + c
        elif isinstance(self._publicaciones[0], Revista):
            c="La Estanteria contiene las siguientes Revistas \n " + c
        elif isinstance(self._publicaciones[0], Folleto):
            c="La Estanteria contiene los siguientes Folletos \n " + c 
        return c
    
    '''def agregarPublicacion(self,codigoP):
        publicaciones = self.getPublicaciones() + p
        self.setPublicaciones(publicaciones)
        for x in p:
            x.setEstanteria(self)'''
        
    
    @classmethod
    def getLista(cls):
        return Estanteria._lista
    @classmethod
    def setLista(cls,lista):
        Estanteria._lista = lista

    @classmethod
    def getNumeroEstanterias(cls):
        return Estanteria._numeroEstanterias

    def getNumero(self):
        return self.numero
    def setNumero(self,a):
        self.numero = a

    def getPiso(self):
        return self.piso
    def setPiso(self,a):
        self.piso = a

    def getLimites(self):
        return self.limites
    def setLimites(self,a):
        self.limites= a

    def getPublicaciones(self):
        return self._publicaciones
    def setPublicaciones(self,a):
        self._publicaciones = a