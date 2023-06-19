# from distutils import command


######## IMPORTAR LA HERRAMIENTAS#########################
from tkinter import *
from tkinter import messagebox
import pickle
from PIL import Image, ImageTk
from Graficas.registro import Frame1
##########################################################



#CLASE PRINCIPAL  contiene frames1,2,3,4,5 FUNCIONES: GraficasPrincipal.
class Principal():


    ####  frames de las opciones Consultar y Procesos  ####
    frame1 = None
    frame2 = None
    frame3 = None
    frame4 = None
    frame5 = None
    ####################################################

    #FUNCION PRINCIPAL ventana: Sistema de Gestion Bibliotecario
    def GraficasPrincipal(self,start):

        #---------------------------------- VENTANA INICIAL -----------------------------------------------#
        #crear una ventana emergente contenedor de MENU, PRINCIPAL (FRAME)
        window = Toplevel()
        #Titulo ventana emergente (inicio del sitema despues del boton iniciar programa)
        window.title("Sistema de Gestion Bibliotecario")
        #minimizar la ventana GestorBiblioteca (SCENE de p1,p2,p3,p4,p5,p6)
        start.iconify()
        #---------------------------------------------------------------------------------#

 
        

        #-----------------------------------TEXTO VENTANA INICIAL--------------------------#
        #Frame inicial (TEXTO INICIAL ACOMPAÑANTE DE MENU)
        principal = Frame(master=window, width=750, height=350)
        principal.pack()

        Label(master=principal,text="Sistema de Gestion Bibliotecario (SGB)",
        font=("Arial",20)).place(x=0,y=0)
        texto = Text(principal, font=("Arial",17),width=100,height=25,relief=GROOVE, borderwidth=4)
        texto.insert(1.0,"En este sistema de gestion podras realizas procesos siguientes:\n\n"+
        "1. Ingresar Registros\n"+
        "2. Mostrar Registros\n"+
        "3. Eliminar Registros\n"+
        "4. Registrar Préstamos\n"+
        "5. Resgitrar Devoluciones\n\n"+
        "Para acceder a estas funcionalidades despliegue el menú de \n'Procesos y Consultas' y haga click en una opción")
        texto.config(state=DISABLED)
        texto.place(x=5,y=40)
        #---------------------------------------------------------------------------------#
        
        # deserializar() # Cargamos todas las listas guardadas

        #----------------------------FUNCIONES INFORMATIVAS (ARCHIVO, AYUDA)--------------------------------------------#
        #FUNCION INICIO  ARCHIVO:(guardar y salir del sistema)
        def inicio():

            # serializar() # Guardamos todas las listas de objetos
            
            #se muestra un mensaje en una ventana emergente con titulo Guardar y salir
            messagebox.showinfo(title="Guardar Y Salir",
            message="INFORMACIÓN:",
            detail="Todos los datos han sido almacenados en el dispositivo")

            # se "desminimiza" la ventana GestorBiblioteca (SCENE de p1,p2,p3,p4,p5,p6)
            start.deiconify() 
            # Destruimos la ventana principal Sistema de Gestion Bibliotecario
            window.destroy() 


        #FUNCION ACERCA  AYUDA:(acerca de)
        def acerca():

            #se muestra un mensaje: ventana emergente: informacion de los programadores
            messagebox.showinfo(title="Acerca de",
            message="Programadores:",
            detail="- Andres Yair Carvajal Bolivar\n- Juan Jose Pineda Sanchez\n- Andres Camilo Uyazan Torres\n- Estiven Ospina Jaramillo")
        
        
        #FUNCION APLICACION  ARCHIVO:(aplicacion)
        def aplicacion():

            #se muestra un mensaje: ventana emergente: informacion del programa
            messagebox.showinfo(title="Aplicación",
            message="Sistema de Gestion Bibliotecario:",
            detail="Por medio de esta aplicación usted podrá tener un registro del material disponible y del estado de los préstamos.")
        #---------------------------------------------------------------------------------#


        #------------------------FUNCIONES APLICATIVAS (PROCESOS Y CONSULTAS)--------------------------------------------#
        #FUNCION INGRESAR PROCESOS Y CONSULTAS:(ingresar registros)
        def ingresar():
            #ocultar el frame principal (contenedor del texto)
            principal.pack_forget()
            #verifica si frame1 ha sido creado o si continua siendo NoNe
            if self.frame1 is None:
                #como frame1 no ha sido creado destruyo los otros frames
                if self.frame2 is not None:
                    self.frame2.destroy()
                if self.frame3 is not None:
                    self.frame3.destroy()
                if self.frame4 is not None:
                    self.frame4.destroy()  
                if self.frame5 is not None:
                    self.frame5.destroy() 
            else:
                #como frame 1 ya ha sido creado destruyo todo
                if self.frame2 is not None:
                    self.frame2.destroy()
                if self.frame3 is not None:
                    self.frame3.destroy()
                if self.frame4 is not None:
                    self.frame4.destroy() 
                if self.frame5 is not None:
                    self.frame5.destroy() 
                self.frame1.destroy() 

            #asigno o re asigno frame1:
            self.frame1 = Frame1(window) 
            self.frame1.pack()

        def mostrar():
            #FUNCION MOSTRAR PROCESOS Y CONSULTAS:(mostrar registros)
            principal.pack_forget()
            if self.frame2 is None:
                if self.frame1 is not None:
                    self.frame1.destroy()
                if self.frame3 is not None:
                    self.frame3.destroy() 
                if self.frame4 is not None:
                    self.frame4.destroy() 
                if self.frame5 is not None:
                    self.frame5.destroy()  
            else:
                if self.frame1 is not None:
                    self.frame1.destroy()
                if self.frame3 is not None:
                    self.frame3.destroy()
                if self.frame4 is not None:
                    self.frame4.destroy() 
                if self.frame5 is not None:
                    self.frame5.destroy() 
                self.frame2.destroy()        # destruyo lo que se haya creado para el frame2

            self.frame2 = Frame2(window) # Frame proceso 2
            self.frame2.pack()
        #FUNCION ELIMINAR PROCESOS Y CONSULTAS:(Eliminar Registros)
        def eliminar():
            principal.pack_forget()
            if self.frame3 is None:
                if self.frame1 is not None:
                    self.frame1.destroy()
                if self.frame2 is not None:
                    self.frame2.destroy()  
                if self.frame4 is not None:
                    self.frame4.destroy()
                if self.frame5 is not None:
                    self.frame5.destroy()  
            else:
                if self.frame1 is not None:
                    self.frame1.destroy()
                if self.frame2 is not None:
                    self.frame2.destroy()
                if self.frame4 is not None:
                    self.frame4.destroy()
                if self.frame5 is not None:
                    self.frame5.destroy()  
                self.frame3.destroy()        # destruyo lo que se haya creado para el frame3

            self.frame3 = Frame3(window) # Frame proceso 3
            self.frame3.pack()

        #FUNCION PRESTAR PROCESOS Y CONSULTAS:(prestamos)
        def prestar():
            principal.pack_forget()
            if self.frame4 is None:
                if self.frame1 is not None:
                    self.frame1.destroy()
                if self.frame2 is not None:
                    self.frame2.destroy() 
                if self.frame3 is not None:
                    self.frame3.destroy()
                if self.frame5 is not None:
                    self.frame5.destroy()    
            else:
                if self.frame1 is not None:
                    self.frame1.destroy()
                if self.frame2 is not None:
                    self.frame2.destroy()
                if self.frame3 is not None:
                    self.frame3.destroy()
                if self.frame5 is not None:
                    self.frame5.destroy() 
                self.frame4.destroy()        # destruyo lo que se haya creado para el frame4

            self.frame4 = Frame4(window) # Frame proceso 4
            self.frame4.pack()
        #FUNCION ENTREGAR PROCESOS Y CONSULTAS:(devoluciones)
        def entregar():
            principal.pack_forget()
            if self.frame5 is None:
                if self.frame1 is not None:
                    self.frame1.destroy()
                if self.frame2 is not None:
                    self.frame2.destroy() 
                if self.frame3 is not None:
                    self.frame3.destroy()
                if self.frame4 is not None:
                    self.frame4.destroy()    
            else:
                if self.frame1 is not None:
                    self.frame1.destroy()
                if self.frame2 is not None:
                    self.frame2.destroy()
                if self.frame3 is not None:
                    self.frame3.destroy()
                if self.frame4 is not None:
                    self.frame4.destroy() 
                self.frame5.destroy()        # destruyo lo que se haya creado para el frame5

            self.frame5 = Frame5(window) # Frame proceso 5
            self.frame5.pack()

        #FUNCION PRINCIPAL_FUNCION PROCESOS Y CONSULTAS:(devoluciones)
        def principal_function():
            if self.frame1 is not None:
                self.frame1.destroy()
            if self.frame2 is not None:
                self.frame2.destroy()
            if self.frame3 is not None:
                self.frame3.destroy()
            if self.frame4 is not None:
                    self.frame4.destroy() 
            if self.frame5 is not None:
                    self.frame5.destroy() 
            principal.pack()

        #--------------------------------------------------------------------------------------------------#
        
        
        #--------------------------------MANEJO DE MENUS-------------------------------------------#
        window.option_add('*tearOff', False)
        menubar = Menu(window)

        archivo = Menu(menubar)
        menubar.add_cascade(menu=archivo, label='Archivo')
        archivo.add_command(label="Aplicación", command=aplicacion)
        archivo.add_command(label="Guardar y Salir", command=inicio)

        procesos = Menu(menubar)
        menubar.add_cascade(menu=procesos, label='Procesos y Consultas')

        procesos.add_command(label="Ingresar Registros", command=ingresar)
        procesos.add_command(label="Mostrar Registros", command=mostrar)
        procesos.add_command(label="Eliminar Registros", command=eliminar)
        procesos.add_command(label="Préstamos", command=prestar)
        procesos.add_command(label="Devoluciones", command=entregar)
        procesos.add_separator()
        procesos.add_command(label="Interfaz de Inicio", command=principal_function)

        ayuda = Menu(menubar)
        menubar.add_cascade(menu=ayuda, label ="Ayuda")
        ayuda.add_command(label="Acerca de", command=acerca)

        window['menu'] = menubar
    #--------------------------------------------------------------------------------------------------#
    #######################################################################################