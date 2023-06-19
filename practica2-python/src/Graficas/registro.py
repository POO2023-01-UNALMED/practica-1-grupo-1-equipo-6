from distutils import command
from tkinter import *
from tkinter import messagebox
from functools import partial
from Graficas.FieldFrame import FieldFrame
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

            

        def uno():
            Label(master=f1,text="Registrar Estantería", font=("Arial",20)).pack()
            Label(master=f1,text="Llene los siguientes campos:",font=("Arial",12)).pack()


            f = Frame(master=f1)  # Frame de la zona de interacción

            def lanzar(arg):


                def guardar():
                
                    numero = interaccion.getValue(criterios[0])
                    piso = interaccion.getValue(criterios[1])
                    ls = interaccion.getValue(criterios[2])
                    li = interaccion.getValue(criterios[3])

                    a = True
                    
                    try:
                        Negativo.ver(piso)
                        NumeroE.ver(ls,li)
                        FueradeRango.ver(piso)
                    except Negativo as n:
                        messagebox.showinfo(title="ERROR",message = n.error2 , detail= n.imprimir(piso))
                        a = False
                    except NumeroE as nu:
                        messagebox.showinfo(title="ERROR",message = nu.error2 , detail= nu.imprimir(ls,li))
                        a = False
                    except FueradeRango as f:
                        messagebox.showinfo(title="ERROR",message = f.error2 , detail= f.imprimir(piso))
                        a = False


                    lim = [ls,li]

                    if a == True :
                        Estanteria(numero,piso,lim) # creacion del objeto

                        messagebox.showinfo(title="Ingresar Estantería",
                        message="INFORMACIÓN:",
                        detail="La estantería ha sido registrada con éxito")
                        
                        lanzar(interaccion)
                    else:
                        pass

                tituloCriterios = "ATRIBUTO"
                criterios = ["Número", "Piso", "Límite Superior", "Límite Inferior"]
                tituloValores = "VALOR"
                valores= [Estanteria.getNumeroEstanterias()+1,'','','']
                habilitado = [1]
                if arg is None:
                    interaccion = FieldFrame(f,tituloCriterios, criterios, tituloValores,valores,habilitado)  # Frame de la zona de interacción
                else:
                    arg.destroy()
                    interaccion = FieldFrame(f,tituloCriterios, criterios, tituloValores,valores,habilitado)  # Frame de la zona de interacción

                interaccion.pack(side=TOP)
                borrar.config(command=partial(lanzar,interaccion))
                aceptar.config(command=guardar)
                f.pack()


            botones = Frame(f)
            aceptar = Button(botones,text="Aceptar")
            aceptar.grid(row=1,column=1)
            borrar = Button(botones,text="Borrar")
            borrar.grid(row=1,column=2)
            botones.pack(side=BOTTOM)

            lanzar(None)

            f1.pack()

        def dos():
            Label(master=f2,text="Registrar Autor", font=("Arial",20)).pack()

            Label(master=f2,text="Llene los siguientes campos:",font=("Arial",12)).pack()

            f = Frame(master=f2)  # Frame de la zona de interacción

            ##
            def lanzar(arg):

                def guardar():
                    nombre = interaccion.getValue(criterios[0])
                    id = interaccion.getValue(criterios[1])
                    nacimiento = interaccion.getValue(criterios[2])
                    pais = interaccion.getValue(criterios[3])
                    vivo= interaccion.getValue(criterios[4])
                    if vivo == "si" or vivo == "Si" or vivo == "SI":
                        vivo = True
                    elif vivo == "no" or vivo == "NO" or vivo == "No":
                        vivo = False

                    a = True
                    
                    try:
                        NumeroE.ver(nombre,nacimiento,pais)
                        FueradeRango.ver2(nombre,pais,nacimiento)
                        #Fecha.ver(nacimiento)
                        
                    except NumeroE as nu:
                        messagebox.showinfo(title="ERROR",message = nu.error2 , detail= nu.imprimir(nombre,nacimiento,pais))
                        a = False
                    except FueradeRango as f:
                        messagebox.showinfo(title="ERROR",message = f.error2 , detail= f.imprimir2(nombre,pais,nacimiento))
                        a = False
                    '''except Fecha as fe:
                        messagebox.showinfo(title="ERROR",message = fe.error2 , detail= '')
                        a = False'''

                    if a == True:

                        Autor(nombre,id,nacimiento,pais,vivo)
                        messagebox.showinfo(title="Ingresar Autor",
                        message="INFORMACIÓN:",
                        detail="El autor ha sido registrado con éxito")
                        #Label(master=f,text=Autor.mostrarRegistros()).pack()
                        #
                        lanzar(interaccion)
                    else:
                        pass

                tituloCriterios = "ATRIBUTO"
                criterios = ["Nombre", "id", "Nacimiento", "Pais","¿Vivo?"]
                tituloValores = "VALOR"
                valores= ['','A' + str(Autor._numeroAutores+1),'','','']
                habilitado = [2]
                if arg is None:
                    interaccion = FieldFrame(f,tituloCriterios, criterios, tituloValores,valores,habilitado)  # Frame de la zona de interacción
                else:
                    arg.destroy()
                    interaccion = FieldFrame(f,tituloCriterios, criterios, tituloValores,valores,habilitado)  # Frame de la zona de interacción

                interaccion.pack(side=TOP)
                borrar.config(command=partial(lanzar,interaccion))
                aceptar.config(command=guardar)
                f.pack()


            botones = Frame(f)
            aceptar = Button(botones,text="Aceptar")
            aceptar.grid(row=1,column=1)
            borrar = Button(botones,text="Borrar")
            borrar.grid(row=1,column=2)
            botones.pack(side=BOTTOM)

            lanzar(None)
            ##

            f2.pack()
