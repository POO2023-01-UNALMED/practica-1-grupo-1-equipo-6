
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





#################### FRAME1 : CONTENEDOR DE P3, P4 ################################################
    p1 = Frame(master=WindowBegin,width=500,height=1000,relief=GROOVE, borderwidth=4,bg="#c0e0fa")
    #------------------------Configuracion de p1--------------------------#
    p1.pack(side=LEFT)
###################################################################################################


#################### FRAME2 : CONTENEDOR DE P5, P6 ###############################################
    p2 = Frame(master=WindowBegin,width=490,height=1000,relief=GROOVE, borderwidth=4,bg="#344b42")
    #------------------------Configuracion de p5--------------------------#
    p2.pack(side=RIGHT)
###################################################################################################


#################### FRAME3 : CONTENEDOR DE label1, desc(FUNCION 1)  #######################################################################################################

    p3 = Frame(master=p1,width=500,height=155,relief=GROOVE, borderwidth=4)
    #------------------------Configuracion de p3--------------------------#
    p3.pack(side=TOP)
    bienv = "Damos la más cordial bienvenida a nuestro\n Sistema de Gestión de Información Bibliotecaria. \n\n¡Nos complace tenerte como\n parte de nuestra \ncomunidad!"
    label1 = Label(p3,text=bienv,font=("Georgia",14))
    label1.place(x=20,y=0)
############################################################################################################################################################################
    

################### FRAME4 : CONTENEDOR DE imagenes del sistema  ############################################
    p4 = Frame(p1,width=500,height=600)
    #-------------Configuracion de p4-----------#
    p4.pack(side=BOTTOM)
    #--------agregar imagenes del sistema ------#
    imagen_ori1 = Image.open("practica2-python/src/Graficas/images/imagen1.png")
    imagen_ori2 = Image.open("practica2-python/src/Graficas/images/imagen2.png")
    imagen_ori3 = Image.open("practica2-python/src/Graficas/images/imagen3.png")
    imagen_ori4 = Image.open("practica2-python/src/Graficas/images/imagen4.png")
    imagen_ori5 = Image.open("practica2-python/src/Graficas/images/imagen5.png")
    #---------redimensionar imagenes del sistema (tamaño) --------------#
    x_deseada = 500
    y_deseada = 400  
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
    #---------imagen inicial de p4 al inicar el programa --------------#
    label = Label(p4)
    label['image'] = imagen1 
    label.grid(row=0, column=0, padx=10, pady=10)
    #---------Boton para iniciar el proyecto--------------#
    ingresar = Button(p4, text="Ingresar al Sistema", font=("Arial", 13), background="#1a42e6", width=20, height=2)
    ingresar.grid(row=1, column=0, pady=50)  # Ubicar el botón debajo de las imágenes con un espacio de 10 píxeles
    #--------------------------FUNCION 2 (conjunto) : EVENTO MOUSE-HOOVER:pasar imagen ---------------------------------------
    image_index = 1

    def change_image():
       global image_index
       image_index = (image_index % 5) + 1
       image_variable = globals()[f"imagen{image_index}"]
       label['image'] = image_variable

    def p4_enter(e):
       global image_change_enabled
       image_change_enabled = True
       change_image()

    def p4_leave(e):
       global image_change_enabled
       image_change_enabled = False

    label.bind('<Enter>', p4_enter)
    label.bind('<Leave>', p4_leave)

    ####################################################################################



    ##### FRAME 5 : CONTENEDOR DE hoja de vida (texto) ########
    p5 = Frame(master=p2,width=490,height=150)
    #-------------Configuracion de p5-----------#
    p5.pack(side=TOP)
    #-------------texto hoja de vida -----------#
    #########################################################################################


    ##### FRAME 6 : CONTENEDOR DE  imagenes de hoja de vida,######################################
    p6 = Frame(master=p2,width=500,height=700)
    #---------Configuracion de p6--------------#
    p6.pack(side=BOTTOM) 



    #--------agregar imagenes de hoja de vida ------#

    images = ["practica2-python/src/Graficas/images/foto{}.png".format(i) for i in range(1, 17)]
    texts = []
    for i in range(1, 5):
        file_path = "practica2-python/src/Graficas/textos/texto{}.txt".format(i)
        with open(file_path, 'r') as file:
            text_content = file.read()
            texts.append(text_content)

    current_text_index = 0
    current_image_index = 0

    # Función para cargar las imágenes
    def load_images():
        for i in range(4):
            image_path = images[current_image_index + i]
            image = Image.open(image_path)
            image = image.resize((200, 300))
            photo = ImageTk.PhotoImage(image)
            image_labels[i].configure(image=photo)
            image_labels[i].image = photo

            # Agregar controlador de evento para abrir el archivo PDF correspondiente
            if current_image_index + i + 1 in [1, 5, 9, 13]:
                image_labels[i].bind("<Button-1>", partial(open_pdf, current_image_index + i + 1))
    def open_pdf(image_number, event):
        pdfs = {
            1: "practica2-python\src\Graficas\hojas\hojavida1.pdf",
            5: "practica2-python\src\Graficas\hojas\hojavida2.pdf",
            9: "practica2-python\src\Graficas\hojas\hojavida3.pdf",
            13: "practica2-python\src\Graficas\hojas\hojavida4.pdf"
            }
        pdf_path = pdfs.get(image_number)
        if pdf_path:
            webbrowser.open(pdf_path)

    # Función para cambiar el texto e imágenes
    def change_text_and_images(event=None):
        global current_text_index, current_image_index
        current_text_index = (current_text_index + 1) % len(texts)
        current_image_index = (current_image_index + 4) % len(images)
        text_label.config(text=texts[current_text_index])
        load_images()
        


    # Configurar el marco p5 para el texto
    text_label = Label(p5, text=texts[current_text_index], font=("Georgia",14))
    text_label.pack()
    text_label.bind("<Button-1>", change_text_and_images)

    # Configurar el marco p6 para las imágenes
    image_labels = []
    for i in range(4):
        image_label = Label(p6)
        image_label.grid(row=i//2, column=i%2)
        image_labels.append(image_label)

    #Cargar las imágenes iniciales
    load_images()
    #####################################################
WindowBegin.mainloop()
