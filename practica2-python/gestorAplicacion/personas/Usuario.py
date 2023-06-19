from abc import ABC, abstractmethod

from gestorAplicacion.obras.Publicacion import Publicacion
from gestorAplicacion.prestamo.Prestamo  import Prestamo

class Usuario:

    _usuarios=[]

    @classmethod
    def mostrarUsuarios(cls):
        from gestorAplicacion.personas.EstudianteProfesor import EstudianteProfesor
        from gestorAplicacion.personas.Externo import Externo
        c = 'USUARIOS CREADOS \n'
        for i,x in enumerate(Externo.l + EstudianteProfesor.l):
            if isinstance(x,EstudianteProfesor):
                c=c + str(i) + f'. Usuario de la Universidad {x.getNombre()} con Identificacion {x.getId()} \n'
            elif isinstance(x,Externo):
                c=c + str(i) + f'. Usuario externo {x.getNombre()} con Identifiacion {x.getId()} \n'
        return c
    
    #Secuencia de metodos para prestamo
    #
    @classmethod
    def buscarUsuario(cls,usuarioId):
        from gestorAplicacion.errores.ErrorAplicacion import Inexistente
        from gestorAplicacion.personas.EstudianteProfesor  import EstudianteProfesor
        from gestorAplicacion.personas.Externo import Externo

        if len(EstudianteProfesor.l + Externo.l) == 0 :
            raise Inexistente()
        else:
            usuario= 0
            for x in EstudianteProfesor.l + Externo.l:
                if x.getId() == usuarioId:
                    usuario = x
                    break
            if usuario == 0:
                raise Inexistente()
            return usuario

    def prestar(self,id,Codigopub,Finicio):
        pass
               
    
    
    @classmethod
    def getUsuarios(cls):
        return Usuario._usuarios
        
    @classmethod
    def setUsuarios(cls,lista):
        Usuario._usuarios = lista

    @abstractmethod
    def prestar(self, publicacion, fechainicio):
        pass
   
    def diasVencimiento(self):
        pass

    
    def renovar(self,prestamo):
        pass
