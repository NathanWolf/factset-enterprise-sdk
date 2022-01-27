"""
    Chart Generation Service

    This is a service for generating charts in a node environment that were created using web charting and get back images in form of `PNGs` and `JPEGs` as response.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from setuptools import setup, find_packages  # noqa: H301

NAME = "fds.sdk.ChartGenerationService"
VERSION = "0.9.0"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
  "urllib3 >= 1.25.3",
  "python-dateutil",
  "fds.sdk.utils == 0.9.0",
]

setup(
    name=NAME,
    version=VERSION,
    description="FactSet SDK - Chart Generation Service",
    author="FactSet Research Systems",
    url="https://github.com/FactSet/enterprise-sdk/tree/master/code/python/ChartGenerationService",
    keywords=["FactSet", "API", "SDK"],
    python_requires=">=3.6",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="Apache-2.0",
    long_description="""\
    This is a service for generating charts in a node environment that were created using web charting and get back images in form of &#x60;PNGs&#x60; and &#x60;JPEGs&#x60; as response.  # noqa: E501
    """
)
