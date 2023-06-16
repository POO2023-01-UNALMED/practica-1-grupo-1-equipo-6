
#################### IMPORTAR HERRAMIENTAS #######################
from ttkthemes import ThemedStyle   #ESTILOS ADICIONALES
import time                         #TIEMPO PARA EJECUTAR CIERTAS ACCIONES
import os                           #INTERACTUAR CON EL SISTEMA OPERATIVO
import pickle                       #SERIALIZAR DESERIALIZAR
from tkinter import *               #HERRAMIENTAS DE TTINKER
from functools import partial       #SIMPLIFICAR LLAMADA DE FUNCIONES
from PIL import Image, ImageTk      #CARGAR Y MANEJAR IMAGENES 
import webbrowser                   #ABRIR PAGINAS WEB CON NAVEGADOR.
##############################################################


if __name__ == "__main__":


   # SCENE : CONTENEDOR DE MENU,P1,P2,P3,P4,P5,P6 #
    WindowBegin = Tk()
    WindowBegin.title("Gestor Bibliotecario")
    WindowBegin.geometry("1000x1000")
    WindowBegin.option_add('*tearOff', False)
   ################################################




   #############################################  MENU: (PARTE DE ARRIBA) ##########################################################
    menubar = Menu(WindowBegin)
    inicio = Menu(menubar)
    menubar.add_cascade(menu=inicio, label='Inicio')

  #--------------------------FUNCION 1 : CLICK-MENU:Inicio, Descripcion:muestra desc en p3 ---------------------------------------
    def description():
        p3.pack_forget()
        label1.place_forget()
        desc = "Descripción:\n\nEl presente es un sistema de información\ndiseñado para una biblioteca, \
el cual permite mantener un registro actualizado del material bibliográfico y controlar el estado de los préstamos realizados."  
        label2 = Label(p3,text=desc, font=("Georgia",18))
        label2.place(x=6,y=10)
        p3.pack(side=TOP)
    #-------------------------------------------------------------------------------------------------------------------------------
    inicio.add_command(label="Descripción", command=description) # utiliza FUNCION 1

    
    inicio.add_command(label="Salir", command=WindowBegin.destroy)

    WindowBegin['menu'] = menubar
    ################################################################################################################################





    #################### FRAME 1 : CONTENEDOR DE P3, P4 ################################################
    p1 = Frame(master=WindowBegin,width=500,height=1000,relief=GROOVE, borderwidth=4,bg="#c0e0fa")
    #-------------Configuracion de p1-----------#
    p1.pack(side=LEFT)
    ###################################################################################################


    #################### FRAME2 : CONTENEDOR DE P5, P6 ###############################################
    p2 = Frame(master=WindowBegin,width=490,height=1000,relief=GROOVE, borderwidth=4,bg="#344b42")
    #-------------Configuracion de p2-----------#
    p2.pack(side=RIGHT)
    ###################################################################################################


    ############## FRAME 3 : CONTENEDOR DE label1, desc(FUNCION 1)  #############

    p3 = Frame(master=p1,width=500,height=155,relief=GROOVE, borderwidth=4)
    #------------------------Configuracion de p3--------------------------#
    p3.pack(side=TOP)
    bienv = "Damos la más cordial bienvenida a nuestro\n Sistema de Gestión de Información Bibliotecaria. \n\n¡Nos complace tenerte como\n parte de nuestra \ncomunidad!"
    label1 = Label(p3,text=bienv,font=("Georgia",14))
    label1.place(x=20,y=0)
    ############################################################################
    

    ##### FRAME 4 : CONTENEDOR DE  imagenes del sistema, boton inciar app  ############################################
    p4 = Frame(p1,width=500,height=600)
    #-------------Configuracion de p4-----------#

    #--------agregar imagenes del sistema ------#
    imagen_ori1 = Image.open("practica2-python/src/Graficas/images/imagen1.png")
    imagen_ori2 = Image.open("practica2-python/src/Graficas/images/imagen2.png")
    imagen_ori3 = Image.open("practica2-python/src/Graficas/images/imagen3.png")
    imagen_ori4 = Image.open("practica2-python/src/Graficas/images/imagen4.png")
    imagen_ori5 = Image.open("practica2-python/src/Graficas/images/imagen5.png")
    #---------redimensionar imagenes del sistema (tamaño)--------------#
    x_deseada = 500
    y_deseada = 600  
    imagen_redimen1 = imagen_ori1.resize((x_deseada, y_deseada), Image.LANCZOS)
    imagen_redimen2 = imagen_ori2.resize((x_deseada, y_deseada), Image.LANCZOS)
    imagen_redimen3 = imagen_ori3.resize((x_deseada, y_deseada), Image.LANCZOS)
    imagen_redimen4 = imagen_ori4.resize((x_deseada, y_deseada), Image.LANCZOS)
    imagen_redimen5 = imagen_ori5.resize((x_deseada, y_deseada), Image.LANCZOS)
    imagen1 = ImageTk.PhotoImage(imagen_redimen1)
    imagen2 = ImageTk.PhotoImage(imagen_redimen2)
    imagen3 = ImageTk.PhotoImage(imagen_redimen3)
    imagen4 = ImageTk.PhotoImage(imagen_redimen4)
    imagen5 = ImageTk.PhotoImage(imagen_redimen5)
    #---------estado inicial del frame (siempre empieza con la imagen 1)--------------#
    label = Label(p4)
    label['image'] = imagen1
    label.place(x=0,y=0)
    #---FUNCION 2 (conjunto): Mouse-Hover: cambiar imagen cuando posiciona el mouse o lo quita---#
    def p4_1(e):
        p4.pack_forget()
        label['image'] = imagen1
        time.sleep(0.3)
        label.bind('<Enter>',p4_2)
        p4.pack(side=BOTTOM)   

    def p4_2(e):
        p4.pack_forget()
        label['image'] = imagen2
        time.sleep(0.3)
        label.bind('<Enter>',p4_3)
        p4.pack(side=BOTTOM)

    def p4_3(e):
        p4.pack_forget()
        label['image'] = imagen3
        time.sleep(0.3)
        label.bind('<Enter>',p4_4)
        p4.pack(side=BOTTOM)

    def p4_4(e):
        p4.pack_forget()
        label['image'] = imagen4
        time.sleep(0.3)
        label.bind('<Enter>',p4_5)
        p4.pack(side=BOTTOM) 

    def p4_5(e):
        p4.pack_forget()
        label['image'] = imagen5
        time.sleep(0.3)
        label.bind('<Enter>',p4_1)
        p4.pack(side=BOTTOM)
    #--------- generar un enlace con la p4-1--------------#    
    label.bind('<Enter>',p4_1)
    #---------Crear el botón para inicar la APP--------------#
    ingresar = Button(p4, text="Ingresar al Sistema", font=("Arial", 13),background="#1a42e6",width=20, height=2)   
    ingresar.place(x=310,y=150)
    p4.pack(side=BOTTOM)  
    ################################################################################


    ##### FRAME 5 : CONTENEDOR DE hoja de vida (texto)##################
    p5 = Frame(master=p2,width=490,height=150)
    #---------Configuracion de p5--------------#
    p5.pack(side=TOP)
    #---------inicializar hoja de vida programador 1--------------#
    hojavida = Text(p5, font=("Georgia",12),relief=GROOVE, borderwidth=4)
    hojavida.insert(1.0,"Programador 1:\n\
(Click en el texto para ver más Programadores!)\n\n\
Nombre:\tAndres Yair Carvajal Bolivar\n\
CC:\t1002579021\n\
Correo:\tancarvajalb@unal.edu.co\n\
Carrera:\tIngeniería de Sistemas e Informática\n\
Institución:\tUniversidad Nacional de Colombia")
    hojavida.place(x=0,y=0)
    ######################################################################

    ##### FRAME 6 : CONTENEDOR DE  imagenes de hoja de vida,######################################
    p6 = Frame(master=p2,width=500,height=700)
    #---------Configuracion de p6--------------#
    p6.pack(side=BOTTOM) 

    #--------agregar imagenes de hoja de vida ------#

    #programador 1
    imagen_original1 = Image.open("practica2-python/src/Graficas/images/foto1.png")
    imagen_original2 = Image.open("practica2-python/src/Graficas/images/foto2.png")
    imagen_original3 = Image.open("practica2-python/src/Graficas/images/foto3.png")
    imagen_original4 = Image.open("practica2-python/src/Graficas/images/foto4.png")

    #programador 2

    imagen_original5 = Image.open("practica2-python/src/Graficas/images/foto5.png")
    imagen_original6 = Image.open("practica2-python/src/Graficas/images/foto6.png")
    imagen_original7 = Image.open("practica2-python/src/Graficas/images/foto7.png")
    imagen_original8 = Image.open("practica2-python/src/Graficas/images/foto8.png")


    #programador 3

    imagen_original9 = Image.open("practica2-python/src/Graficas/images/foto9.png")
    imagen_original10 = Image.open("practica2-python/src/Graficas/images/foto10.png")
    imagen_original11 = Image.open("practica2-python/src/Graficas/images/foto11.png")
    imagen_original12 = Image.open("practica2-python/src/Graficas/images/foto12.png")


    #programador 2

    imagen_original13 = Image.open("practica2-python/src/Graficas/images/foto13.png")
    imagen_original14 = Image.open("practica2-python/src/Graficas/images/foto14.png")
    imagen_original15 = Image.open("practica2-python/src/Graficas/images/foto15.png")
    imagen_original16 = Image.open("practica2-python/src/Graficas/images/foto16.png")


    #---------redimensionar imagenes de hoja de vida (tamaño)--------------#
    ancho_deseado = 200
    alto_deseado = 300  

    #programador 1
    imagen_redimensionada1 = imagen_original1.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada2 = imagen_original2.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada3 = imagen_original3.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada4 = imagen_original4.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    
    #---------arreglo para abrir imagen con formato distinto al png (foto 2)--------------#
    imagen_jpeg = Image.open("practica2-python/src/Graficas/images/foto2.jpeg")
    ruta_destino = "practica2-python/src/Graficas/images/foto2.png"
    imagen_jpeg.save(ruta_destino, "PNG")


    #programador 2

    imagen_redimensionada5 = imagen_original5.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada6 = imagen_original6.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada7 = imagen_original7.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada8 = imagen_original8.resize((ancho_deseado, alto_deseado), Image.LANCZOS)

    #programador 3
    imagen_redimensionada9 = imagen_original9.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada10 = imagen_original10.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada11 = imagen_original11.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada12 = imagen_original12.resize((ancho_deseado, alto_deseado), Image.LANCZOS)

    #programador 4

    imagen_redimensionada13 = imagen_original13.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada14 = imagen_original14.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada15 = imagen_original15.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada16 = imagen_original16.resize((ancho_deseado, alto_deseado), Image.LANCZOS)

    #---------vincular variable a la foto ya redimensionada--------------#

    #programador 1
    foto1 = ImageTk.PhotoImage(imagen_redimensionada1)
    foto2 = ImageTk.PhotoImage(imagen_redimensionada2)
    foto3 = ImageTk.PhotoImage(imagen_redimensionada3)
    foto4 = ImageTk.PhotoImage(imagen_redimensionada4)

    #programador 2
    foto5 = ImageTk.PhotoImage(imagen_redimensionada5)
    foto6 = ImageTk.PhotoImage(imagen_redimensionada6)
    foto7 = ImageTk.PhotoImage(imagen_redimensionada7)
    foto8 = ImageTk.PhotoImage(imagen_redimensionada8)

    #programador 3
    foto9 = ImageTk.PhotoImage(imagen_redimensionada9)
    foto10 = ImageTk.PhotoImage(imagen_redimensionada10)
    foto11 = ImageTk.PhotoImage(imagen_redimensionada11)
    foto12 = ImageTk.PhotoImage(imagen_redimensionada12)

    #programador 4 
    foto13 = ImageTk.PhotoImage(imagen_redimensionada13)
    foto14 = ImageTk.PhotoImage(imagen_redimensionada14)
    foto15 = ImageTk.PhotoImage(imagen_redimensionada15)
    foto16 = ImageTk.PhotoImage(imagen_redimensionada16)

    #---------configurar ubicacion fotos--------------#
    framefoto1 = Frame(master=p6)
    labelfoto1 = Label(framefoto1)
    labelfoto1['image'] = foto1

    framefoto2 = Frame(master=p6)
    labelfoto2 = Label(framefoto2)
    labelfoto2['image'] = foto2
    labelfoto2.pack()
    framefoto2.grid(row=1,column=2)

    framefoto3 = Frame(master=p6)
    labelfoto3 = Label(framefoto3)
    labelfoto3['image'] = foto3
    labelfoto3.pack()
    framefoto3.grid(row=2,column=1)

    framefoto4 = Frame(master=p6)
    labelfoto4 = Label(framefoto4)
    labelfoto4['image'] = foto4
    labelfoto4.pack()
    framefoto4.grid(row=2,column=2)

    #---------FUNCION 3 : CLICK: FOTO1 : ABRIR WEB CON PDF HOJA VIDA--------------#
    def abrir_pdf():
        # Ruta del archivo PDF
        rr = "practica2-python\src\Graficas\hojas\hojavida1.pdf"  
        
        # Abrir el archivo PDF en el navegador por defecto
        webbrowser.open(rr)
    #-----------------------------------------------------------------------------#
    labelfoto1.bind("<Button-1>", lambda event: abrir_pdf())
    labelfoto1.pack()
    framefoto1.grid(row=1,column=1)
    #-----------------------------------------------------------------------------#

    #-----------------FUNCION 4 : CAMBIO DE HOJA DE VIDA :CLICK:------------------#

    def frameB_1(e):
        hojavida.delete(1.0,8.0)
        hojavida.insert(1.0,"Programador 1:\n\
(Click en el texto para ver más Programadores!)\n\n\
Nombre:\tAndres Yair Carvajal Bolivar\n\
CC:\t1002579021\n\
Correo:\tancarvajalb@unal.edu.co\n\
Carrera:\tIngeniería de Sistemas e Informática\n\
Institución:\tUniversidad Nacional de Colombia\n")
        hojavida.place(x=0,y=0)

        p6.pack_forget()
        labelfoto1['image']= foto1
        labelfoto2['image']= foto2
        labelfoto3['image']= foto3
        labelfoto4['image']= foto4
        p6.pack(side=BOTTOM)

        hojavida.bind('<ButtonPress-1>',frameB_2) 


    def frameB_2(e):
        hojavida.delete(1.0,8.0)
        hojavida.insert(1.0,"Programador 2:\n\
(Click en el texto para ver más Programadores!)\n\n\
Nombre:\tJuan Jose Pineda\n\
CC:\t1193078466\n\
Correo:\t@unal.edu.co\n\
Carrera:\tIngeniería de Sistemas e Informática\n\
Institución:\tUniversidad Nacional de Colombia\n")
        hojavida.place(x=0,y=0)

        p6.pack_forget()
        labelfoto1['image']= foto5
        labelfoto2['image']= foto6
        labelfoto3['image']= foto7
        labelfoto4['image']= foto8
        p6.pack(side=BOTTOM)

        hojavida.bind('<ButtonPress-1>',frameB_1) 
    #Bind inicial
    hojavida.bind('<ButtonPress-1>',frameB_2)
    







    ###############################################################################################








WindowBegin.mainloop()