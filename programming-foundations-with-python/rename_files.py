import os

def rename_files():
	root = "/Users/katzhang/Documents/Work-FCB/"
	file_list = os.listdir(root)
	os.chdir("/Users/katzhang/Documents/Work-FCB/")
	for file in file_list:
		os.rename(file, file + '-renamed')
	print(os.listdir(root))
rename_files();