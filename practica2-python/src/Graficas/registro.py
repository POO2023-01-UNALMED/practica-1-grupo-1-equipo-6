from distutils import command
from tkinter import *
from tkinter import messagebox
from functools import partial
from Ventanas.FieldFrame import FieldFrame
from tkinter import ttk


class Frame1(Frame):
    _opcion = None
    def __init__(self,w):
        super().__init__(master=w,width=450)
        f_ini = Frame(master=self)
        f1 = Frame(master=self)
        f2 = Frame(master=self)
        f3 = Frame(master=self)
        f4 = Frame(master=self)
        f5 = Frame(master=self)
        f6 = Frame(master=self)
        f7 = Frame(master=self)

        def ini():
            Label(master=f_ini,text="Ingresar Registros",
            font=("Arial",20)).pack()

            Label(master=f_ini,text="Seleccione el tipo de dato que desee ingresar",
            font=("Arial",12)).pack()


            interaccion = Frame(master=f_ini)  # Frame de la zona de interacción

            def ejecutar(arg):
                self._opcion = arg.get()

                def ejecutar2():
                    self._opcion = opciones.get() #Se guarda la opción correcta
                    f_ini.pack_forget() # Se oculta la vntana inicial
                    if self._opcion == "Libro":
                        tres()
                    elif self._opcion == "Folleto":
                        cuatro()
                    elif self._opcion == "Revista":
                        cinco()
                    elif self._opcion == "Interno":
                        seis()
                    elif self._opcion == "Externo":
                        siete()


                if self._opcion == "Estantería":
                    f_ini.pack_forget()
                    uno()
                elif self._opcion == "Autor":
                    f_ini.pack_forget()
                    dos()
                elif self._opcion == "Publicación":
                    label.config(text="Tipo de Publicación:")
                    label.pack()
                    opciones = ttk.Combobox(interaccion)
                    opciones['values']= ["Libro","Folleto","Revista"]
                    opciones.pack()

                    Button(interaccion,text="Aceptar",command=ejecutar2).pack()   

                elif self._opcion == "Usuario":
                    label.config(text="Tipo de Usuario:")
                    label.pack()
                    opciones = ttk.Combobox(interaccion)
                    opciones['values']= ["Interno","Externo"]
                    opciones.pack()

                    Button(interaccion,text="Aceptar",command=ejecutar2).pack()

            opciones = ttk.Combobox(interaccion)
            opciones['values']= ["Estantería","Autor","Publicación","Usuario"]
            opciones.pack()

            Button(interaccion,text="Aceptar",command=partial(ejecutar,opciones)).pack()

            label = Label(master=interaccion,font=("Arial",10)) # Para desplegar otra opción

            interaccion.pack()

            f_ini.pack()
