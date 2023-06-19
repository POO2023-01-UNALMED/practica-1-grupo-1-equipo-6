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
        def tres():
            Label(master=f3,text="Registrar Libro", font=("Arial",20)).pack()

            Label(master=f3,text="Llene los siguientes campos:",font=("Arial",12)).pack()


            f = Frame(master=f3)  # Frame de la zona de interacción

            ##
            def lanzar(arg):

                def guardar():
                    codigo = interaccion.getValue(criterios[0])
                    nombre = interaccion.getValue(criterios[1])
                    año = interaccion.getValue(criterios[2])
                    ejemplar = interaccion.getValue(criterios[3])
                    idautor = interaccion.getValue(criterios[4])
                    tipo= interaccion.getValue(criterios[5])
                    referencia= interaccion.getValue(criterios[6])
                    volumen= interaccion.getValue(criterios[7])
                    nestanteria= interaccion.getValue(criterios[8])


                    
                    l = Libro(codigo,nombre,año,ejemplar,None ,tipo,referencia,volumen, None)
                    l.asignarAutor(idautor)
                    l.asignarEstanteria(nestanteria)

                    messagebox.showinfo(title="Ingresar Libro",
                    message="INFORMACIÓN:",
                    detail="El libro ha sido registrado con éxito")

                    #Label(master=f,text=Publicacion.mostrarRegistros()).pack()
                    #
                    #
                    lanzar(interaccion)

                tituloCriterios = "ATRIBUTO"
                criterios = ["Codigo", "Nombre", "Año",'Ejemplar' ,"Autor(ID)",'Tipo',"Referencia","Volumen","Estanteria(#)"]
                tituloValores = "VALOR"
                valores= ['L'+str(Libro._numeroLibro+1),'','','','','','','','']
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

            ##


            f3.pack()

        def cuatro():
            Label(master=f4,text="Registrar Folleto", font=("Arial",20)).pack()

            Label(master=f4,text="Llene los siguientes campos:",font=("Arial",12)).pack()


            f = Frame(master=f4)  # Frame de la zona de interacción

            ##
            def lanzar(arg):

                def guardar():
                    codigo = interaccion.getValue(criterios[0])
                    nombre = interaccion.getValue(criterios[1])
                    año = interaccion.getValue(criterios[2])
                    ejemplar = interaccion.getValue(criterios[3])
                    referencia= interaccion.getValue(criterios[4])
                    nestanteria= interaccion.getValue(criterios[5])
                    
                    f=Folleto(codigo,nombre,año,ejemplar,referencia,None)
                    f.asignarEstanteria(nestanteria)

                    messagebox.showinfo(title="Ingresar Folleto",
                    message="INFORMACIÓN:",
                    detail="El folleto ha sido registrado con éxito")
                    #
                    #
                    lanzar(interaccion)

                tituloCriterios = "ATRIBUTO"
                criterios = ["Codigo", "Nombre", "Año",'Ejemplar',"Referencia","Estanteria(#)"]
                tituloValores = "VALOR"
                valores= ['F'+str(len(Folleto.getFolleto())+1),'','','','','']
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


            f4.pack()
        def cinco():
            Label(master=f5,text="Registrar Revista", font=("Arial",20)).pack()

            Label(master=f5,text="Llene los siguientes campos:",font=("Arial",12)).pack()


            f = Frame(master=f5)  # Frame de la zona de interacción



            def lanzar(arg):

                def guardar():
                    codigo = interaccion.getValue(criterios[0])
                    nombre = interaccion.getValue(criterios[1])
                    año = interaccion.getValue(criterios[2])
                    ejemplar = interaccion.getValue(criterios[3])
                    numero = interaccion.getValue(criterios[4])
                    mes= interaccion.getValue(criterios[5])
                    temporada= interaccion.getValue(criterios[6])
                    nestanteria= interaccion.getValue(criterios[7])
                    
                    r = Revista(codigo, nombre,año,ejemplar,numero,mes,temporada,None)
                    r.asignarEstanteria(nestanteria)

                    messagebox.showinfo(title="Ingresar Revista",
                    message="INFORMACIÓN:",
                    detail="La revista ha sido registrada con éxito")
                    #
                    #
                    lanzar(interaccion)

                tituloCriterios = "ATRIBUTO"
                criterios = ["Codigo", "Nombre", "Año",'Ejemplar' ,"Numero",'Mes',"Temporada","Estanteria(#)"]
                tituloValores = "VALOR"
                valores= ['R'+str(len(Revista.getRevista())+1),'','','','','','','']
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


            f5.pack()

        def seis():
            Label(master=f6,text="Registrar Usuario Interno", font=("Arial",20)).pack()

            Label(master=f6,text="Llene los siguientes campos:",font=("Arial",12)).pack()


            f = Frame(master=f6)  # Frame de la zona de interacción
            
            def lanzar(arg):

                def guardar():
                    nombre= interaccion.getValue(criterios[0])
                    id = interaccion.getValue(criterios[1])
                    correo = interaccion.getValue(criterios[2])
                    tel = interaccion.getValue(criterios[3])
                    dir = interaccion.getValue(criterios[4])
                    nac= interaccion.getValue(criterios[5])
                    pais= interaccion.getValue(criterios[6])
                    rol= interaccion.getValue(criterios[7])
                    
                    obj = EstudianteProfesor(nombre,id,correo,tel,dir,nac,pais,rol)
                    messagebox.showinfo(title="Ingresar Usuario Interno",
                    message="INFORMACIÓN:",
                    detail="El usuario interno ha sido registrado con éxito")
                    # Label(master=f,text=Usuario.mostrarUsuarios()).pack()
                    #
                    #
                    lanzar(interaccion)

                tituloCriterios = "ATRIBUTO"
                criterios = ["Nombre", "Id", "Correo",'Telefono' ,"Direccion",'Nacimiento',"Pais","Rol"]
                tituloValores = "VALOR"
                valores= None
                habilitado = [None]
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

            f6.pack()

        def siete():
            Label(master=f7,text="Registrar Usuario Externo", font=("Arial",20)).pack()

            Label(master=f7,text="Llene los siguientes campos:",font=("Arial",12)).pack()


            f = Frame(master=f7)  # Frame de la zona de interacción


            def lanzar(arg):

                def guardar():
                    nombre= interaccion.getValue(criterios[0])
                    id = interaccion.getValue(criterios[1])
                    correo = interaccion.getValue(criterios[2])
                    tel = interaccion.getValue(criterios[3])
                    dir = interaccion.getValue(criterios[4])
                    nac= interaccion.getValue(criterios[5])
                    pais= interaccion.getValue(criterios[6])
                    rol= interaccion.getValue(criterios[7])
                    uni = interaccion.getValue(criterios[8])
                    
                    obj = Externo(nombre,id,correo,tel,dir,nac,pais,rol,uni)
                    #Label(master=f,text=Persona.mostrarRegistros()).pack()
                    messagebox.showinfo(title="Ingresar Usuario Externo",
                    message="INFORMACIÓN:",
                    detail="El usuario externo ha sido registrado con éxito")
                    #
                    #
                    lanzar(interaccion)

                tituloCriterios = "ATRIBUTO"
                criterios = ["Nombre", "Id", "Correo",'Telefono' ,"Direccion",'Nacimiento',"Pais","Rol","Universidad"]
                tituloValores = "VALOR"
                valores= None
                habilitado = None
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


            f7.pack()
        

        ini()

