from enum import auto
from gestorAplicacion.personas.Persona import Persona


class Autor(Persona):
    #Atributo de clase
    _autores=[]
    _numeroAutores = len(_autores)

    #Constructor
    def __init__(self,nombre='Anonimo',id=0,nacimiento='...',pais='...',vivo=True,libros=None):
        Autor._autores.append(self)
        if libros is None:
            self.libros=[]
        else:
            self.libros=libros
        super().__init__(nombre,id,"na",'na','na',nacimiento,pais,vivo)
        '''a=True
        for x in Autor._autores:
            if x.getId() == self.getId():
                a= False

                break
        if a == True:
            Autor._autores.append(self)
        else:
            print("El autor ya se encuentra registrado")'''


    #metodos
    def infoPersonal(self):
        c=""
        if self.nombre == 'Anonimo':
            c= "El autor es anonimo"
        elif self.isVivo() == True :
            c = f'INFORMACION DEL AUTOR: \n Nombre: {self.nombre} \n Pais de Origen: {self.pais} \n Fecha de nacimiento: {self.nacimiento} \n ¿Vivo?: SI'
        elif self.isVivo() == False:
            c = f'INFORMACION DEL AUTOR: \n Nombre: {self.nombre} \n Pais de Origen: {self.pais} \n Fecha de nacimiento: {self.nacimiento} \n ¿Vivo?: NO'
        return c


    @classmethod
    def mostrarRegistros(cls):
        c= 'AUTORES CREADOS \n '
        for x in Autor._autores:
            c = c + f'Autor {x.getNombre()} con ID {x.getId()} \n'
        return c

    
    

    
    @classmethod
    def getAutores(cls):
        return Autor._autores
    @classmethod
    def setAutores(cls,lista):
        Autor._autores = lista
    
    def getLibros(self):
        return self.libros
    def setLibros(self,l):
        self.libros = l