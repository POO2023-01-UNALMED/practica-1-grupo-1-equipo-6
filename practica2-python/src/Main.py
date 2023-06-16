from ttkthemes import ThemedStyle
import time
import os
import pickle
from tkinter import *
from functools import partial
from PIL import Image, ImageTk
import webbrowser
if __name__ == "__main__":
    
    WindowBegin = Tk()
    WindowBegin.title("Gestor Bibliotecario")
    WindowBegin.geometry("1000x1000")

    def description():
        p3.pack_forget()
        label1.place_forget()
        desc = "Descripción:\n\nEl presente es un sistema de información\ndiseñado para una biblioteca, \
el cual permite mantener un registro actualizado del material bibliográfico y controlar el estado de los préstamos realizados."
        
        label2 = Label(p3,text=desc, font=("Georgia",18))
        label2.place(x=6,y=10)
        p3.pack(side=TOP)

    # Manejo del menú
    WindowBegin.option_add('*tearOff', False)
    menubar = Menu(WindowBegin)
    inicio = Menu(menubar)
    menubar.add_cascade(menu=inicio, label='Inicio')
    inicio.add_command(label="Descripción", command=description)
    inicio.add_command(label="Salir", command=WindowBegin.destroy)

    WindowBegin['menu'] = menubar

    # Manejo de frames
    p1 = Frame(master=WindowBegin,width=500,height=1000,relief=GROOVE, borderwidth=4,bg="#c0e0fa")
    
    
    #p3
    p3 = Frame(master=p1,width=500,height=155,relief=GROOVE, borderwidth=4)
    p3.pack(side=TOP)

    label1 = Label(p3,text="Damos la más cordial bienvenida a nuestro\n Sistema de Gestión de Información Bibliotecaria. \n\n¡Nos complace tenerte como\n parte de nuestra \ncomunidad!",font=("Georgia",14))
    label1.place(x=20,y=0)

    #p4
    imagen_ori1 = Image.open("practica2-python/src/Graficas/images/imagen1.png")
    imagen_ori2 = Image.open("practica2-python/src/Graficas/images/imagen2.png")
    imagen_ori3 = Image.open("practica2-python/src/Graficas/images/imagen3.png")
    imagen_ori4 = Image.open("practica2-python/src/Graficas/images/imagen4.png")
    imagen_ori5 = Image.open("practica2-python/src/Graficas/images/imagen5.png")
     # Redimensionar la imagen a un tamaño deseado
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
    # Estado incial del frame
    p4 = Frame(p1,width=500,height=600)   
    label = Label(p4)
    label['image'] = imagen1
    label.place(x=0,y=0)
    # command=partial(Principal().VentanaPrincipal,WindowBegin)



    # Crear el botón con el estilo personalizado
    ingresar = Button(p4, text="Ingresar al Sistema", font=("Arial", 13),background="#1a42e6",width=20, height=2)   
    ingresar.place(x=310,y=150)
    p4.pack(side=BOTTOM)  

    

    def p4_1(e):
        p4.pack_forget()
        label['image'] = imagen1
        time.sleep(1)
        label.bind('<Enter>',p4_2)
        p4.pack(side=BOTTOM)   

    def p4_2(e):
        p4.pack_forget()
        label['image'] = imagen2
        time.sleep(1)
        label.bind('<Enter>',p4_3)
        p4.pack(side=BOTTOM)

    

    def p4_3(e):
        p4.pack_forget()
        label['image'] = imagen3
        time.sleep(1)
        label.bind('<Enter>',p4_4)
        p4.pack(side=BOTTOM)

    def p4_4(e):
        p4.pack_forget()
        label['image'] = imagen4
        time.sleep(1)
        label.bind('<Enter>',p4_5)
        p4.pack(side=BOTTOM) 

    def p4_5(e):
        p4.pack_forget()
        label['image'] = imagen5
        time.sleep(1)
        label.bind('<Enter>',p4_1)
        p4.pack(side=BOTTOM) 


    #Bind inicial
    label.bind('<Enter>',p4_1)

    p1.pack(side=LEFT)
    p2 = Frame(master=WindowBegin,width=490,height=1000,relief=GROOVE, borderwidth=4,bg="#344b42")
    #p
    p5 = Frame(master=p2,width=490,height=150)

    hojavida = Text(p5, font=("Georgia",12),relief=GROOVE, borderwidth=4)
    hojavida.insert(1.0,"Programador 1:\n\
(Click en el texto para ver más Programadores!)\n\n\
Nombre:\tAndres Yair Carvajal Bolivar\n\
CC:\t1002579021\n\
Correo:\tancarvajalb@unal.edu.co\n\
Carrera:\tIngeniería de Sistemas e Informática\n\
Institución:\tUniversidad Nacional de Colombia")
    hojavida.place(x=0,y=0)
    p5.pack(side=TOP)

    #p6
    p6 = Frame(master=p2,width=500,height=700)

        # Cargar la imagen original
    imagen_original = Image.open("practica2-python/src/Graficas/images/foto1.png")
    imagen_original1 = Image.open("practica2-python/src/Graficas/images/foto2.png")
    imagen_original2 = Image.open("practica2-python/src/Graficas/images/foto3.png")
    imagen_original3 = Image.open("practica2-python/src/Graficas/images/foto4.png")
    # Redimensionar la imagen a un tamaño deseado
    ancho_deseado = 200
    alto_deseado = 300  
    imagen_redimensionada = imagen_original.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada1 = imagen_original1.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada2 = imagen_original2.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    imagen_redimensionada3 = imagen_original3.resize((ancho_deseado, alto_deseado), Image.LANCZOS)
    # Convertir la imagen redimensionada a formato compatible con Tkinter
    

    # Crear el widget Label y asignar la imagen redimensionada
        
        # Abrir la imagen JPEG
    imagen_jpeg = Image.open("practica2-python/src/Graficas/images/foto2.jpeg")

    # Convertir la imagen a formato PNG
    ruta_destino = "practica2-python/src/Graficas/images/foto2.png"
    imagen_jpeg.save(ruta_destino, "PNG")
    foto1 = ImageTk.PhotoImage(imagen_redimensionada)
    foto2 = ImageTk.PhotoImage(imagen_redimensionada1)
    foto3 = ImageTk.PhotoImage(imagen_redimensionada2)
    foto4 = ImageTk.PhotoImage(imagen_redimensionada3)
    
    foto5 = PhotoImage(file="practica2-python/src/Graficas/images/foto#.png")
    foto6 = PhotoImage(file="practica2-python/src/Graficas/images/foto#.png")
    foto7 = PhotoImage(file="practica2-python/src/Graficas/images/foto#.png")
    foto8 = PhotoImage(file="practica2-python/src/Graficas/images/foto#.png")

    def abrir_pdf():
        # Ruta del archivo PDF
        rr = "practica2-python\src\Graficas\hojas\hojavida1.pdf"  # Reemplaza con la ruta de tu archivo PDF
        
        # Abrir el archivo PDF en el navegador por defecto
        webbrowser.open(rr)

    framefoto1 = Frame(master=p6)
    labelfoto1 = Label(framefoto1)
    labelfoto1['image'] = foto1

    labelfoto1.bind("<Button-1>", lambda event: abrir_pdf())
    labelfoto1.pack()
    framefoto1.grid(row=1,column=1)

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

    p6.pack(side=BOTTOM) 


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
CC:\t#\n\
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

    p2.pack(side=RIGHT)

    WindowBegin.mainloop()