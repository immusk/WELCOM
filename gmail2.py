from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time
import pytest
driver = webdriver.Chrome('F:\\Cdriver\chromedriver.exe')
driver.maximize_window()
driver.get("http://www.gmail.com")
time.sleep(10)
driver.find_element_by_id('Email').send_keys('imranrehman5155')
driver.find_element_by_id('Passwd').send_keys('youareacheater')
driver.find_element_by_id('signIn').click()
time.sleep(15)
element = WebDriverWait(driver,30).until(
        EC.presence_of_element_located((By.XPATH, '//div[@class="T-I J-J5-Ji T-I-KE L3"]')))
element.click()

element1 = WebDriverWait(driver,20).until(
        EC.presence_of_element_located((By.XPATH, '//textarea[@name="to"]')))
element1.send_keys('imranrehman5155@gmail.com')

element2 = WebDriverWait(driver,20).until(
        EC.presence_of_element_located((By.XPATH, '//input[@name="subjectbox"]')))
element2.send_keys('my second automated mail')

element3 = WebDriverWait(driver,20).until(
        EC.presence_of_element_located((By.XPATH, '//div[@class="Am Al editable LW-avf"]')))
element3.send_keys('hi this is my new mail which is generated automatically')

driver.find_element_by_xpath('//div[@class="T-I J-J5-Ji aoO T-I-atl L3"]').click()

driver.find_element_by_xpath('//span[@class="gb_Z gbii"]').click()
driver.find_element_by_xpath('//a[@class="gb_Sb gb_Zb gb_V"]').click()
time.sleep()
driver.close()

#driver.find_element_by_xpath('//div[@class="T-I J-J5-Ji T-I-KE L3"]').click()
#driver.find_element_by_xpath('//textarea[@name="to"]').send_keys('imranrehman5155@gmail.com')
#driver.find_element_by_xpath('//input[@name="subjectbox"]').send_keys('my new automated mail')
#driver.find_element_by_xpath('//div[@class="Am Al editable LW-avf"]').send_keys('hi this is my new mail which is generated automatically')
#pytest.set_trace()
